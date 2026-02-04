import React, { useState, useEffect } from 'react';
import styles from './PrincipalDashboard.module.css';
import {
    LayoutDashboard, Users, GraduationCap, FileText, TrendingUp,
    ShieldCheck, Calendar, LogOut, BarChart2, Activity, PieChart,
    Cpu, AlertTriangle, Search, Award
} from 'lucide-react';
import {
    COLLEGE_DETAILS, principalStats, hodSubmissionStatus,
    academicTrends, deptRankings, attendanceCorrelation, collegeStats,
    aiInsights, liveTickerData, heatmapData, studentsList
} from '../utils/mockData';
import {
    Bar, Line, Pie, Scatter
} from 'react-chartjs-2';
import {
    Chart as ChartJS, CategoryScale, LinearScale, PointElement, LineElement,
    BarElement, Title, Tooltip, Legend, ArcElement
} from 'chart.js';

ChartJS.register(
    CategoryScale, LinearScale, PointElement, LineElement,
    BarElement, Title, Tooltip, Legend, ArcElement
);

const PrincipalDashboard = () => {
    const [activeTab, setActiveTab] = useState('overview');
    const [insightIndex, setInsightIndex] = useState(0);

    // AI Typing Effect Rotator
    useEffect(() => {
        const interval = setInterval(() => {
            setInsightIndex((prev) => (prev + 1) % aiInsights.length);
        }, 5000); // Change insight every 5 seconds
        return () => clearInterval(interval);
    }, []);

    const menuItems = [
        { id: 'overview', label: 'Dashboard Overview', icon: <LayoutDashboard size={20} /> },
        { id: 'performance', label: 'Department Performance', icon: <BarChart2 size={20} /> },
        { id: 'compliance', label: 'IA Compliance Monitor', icon: <ShieldCheck size={20} /> },
        { id: 'outcomes', label: 'Student Outcomes', icon: <GraduationCap size={20} /> },
    ];

    /* Chart Configs */
    const barData = {
        labels: collegeStats.branches,
        datasets: [{
            label: 'Avg IA Performance (%)',
            data: collegeStats.branchPerformance,
            backgroundColor: ['#3b82f6', '#10b981', '#f59e0b', '#ef4444', '#8b5cf6'],
            borderRadius: 6
        }]
    };

    const scatterData = {
        datasets: [{
            label: 'Attendance vs IA Marks',
            data: attendanceCorrelation,
            backgroundColor: 'rgba(99, 102, 241, 0.6)',
        }]
    };

    /* Sub-Components */
    const Ticker = () => (
        <div className={styles.tickerContainer}>
            <div className={styles.tickerWrapper}>
                {liveTickerData.map((item, idx) => (
                    <div key={idx} className={styles.tickerItem}>
                        <span style={{ opacity: 0.7 }}>[{item.time}]</span> {item.msg}
                    </div>
                ))}
            </div>
        </div>
    );

    const AIInsightsCard = () => (
        <div className={styles.aiCard} style={{ padding: '1.5rem', borderRadius: '16px', marginBottom: '2rem' }}>
            <div className={styles.aiHeader}>
                <div style={{ display: 'flex', alignItems: 'center', gap: '10px' }}>
                    <Cpu size={20} className={styles.pulse} />
                    <span style={{ fontWeight: 'bold', letterSpacing: '1px' }}>CORTEX AI ANALYTICS</span>
                </div>
                <div style={{ fontSize: '0.8rem', opacity: 0.7 }}>LIVE ANALYSIS</div>
            </div>
            <div className={styles.typingEffect}>
                {aiInsights[insightIndex]}
            </div>
        </div>
    );

    const HeatmapSection = () => (
        <div className={styles.tableCard}>
            <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center' }}>
                <h3 className={styles.chartTitle}>College-Wide Academic Heatmap</h3>
                <div style={{ display: 'flex', gap: '10px', fontSize: '0.8rem' }}>
                    <span style={{ display: 'flex', alignItems: 'center', gap: '5px' }}><div className={`${styles.heatCell} ${styles.heatGood}`} style={{ width: 12, height: 12 }}></div> Good</span>
                    <span style={{ display: 'flex', alignItems: 'center', gap: '5px' }}><div className={`${styles.heatCell} ${styles.heatAvg}`} style={{ width: 12, height: 12 }}></div> Avg</span>
                    <span style={{ display: 'flex', alignItems: 'center', gap: '5px' }}><div className={`${styles.heatCell} ${styles.heatRisk}`} style={{ width: 12, height: 12 }}></div> Risk</span>
                </div>
            </div>
            <div className={styles.heatmapGrid}>
                {heatmapData.map((cell) => (
                    <div
                        key={cell.id}
                        className={`${styles.heatCell} ${cell.status === 'Excellent' ? styles.heatGood : cell.status === 'Average' ? styles.heatAvg : styles.heatRisk}`}
                        title={`Student #${cell.id} - Score: ${cell.score}%`}
                    ></div>
                ))}
            </div>
        </div>
    );

    const OverviewSection = () => (
        <>
            <AIInsightsCard />

            <div className={styles.metricsGrid}>
                <div className={styles.glassCard}>
                    <div className={styles.cardIcon} style={{ background: '#dbeafe', color: '#2563eb' }}>
                        <Users size={24} />
                    </div>
                    <div>
                        <p className={styles.cardLabel}>Total Students</p>
                        <p className={styles.cardValue}>{principalStats.totalStudents}</p>
                    </div>
                </div>
                <div className={styles.glassCard}>
                    <div className={styles.cardIcon} style={{ background: '#dcfce7', color: '#16a34a' }}>
                        <GraduationCap size={24} />
                    </div>
                    <div>
                        <p className={styles.cardLabel}>Placement Rate</p>
                        <p className={styles.cardValue}>{principalStats.placementRate}%</p>
                    </div>
                </div>
                <div className={styles.glassCard}>
                    <div className={styles.cardIcon} style={{ background: '#fef9c3', color: '#ca8a04' }}>
                        <TrendingUp size={24} />
                    </div>
                    <div>
                        <p className={styles.cardLabel}>Avg Attendance</p>
                        <p className={styles.cardValue}>{principalStats.avgAttendance}%</p>
                    </div>
                </div>
                <div className={styles.glassCard}>
                    <div className={styles.cardIcon} style={{ background: '#f3e8ff', color: '#7c3aed' }}>
                        <Activity size={24} />
                    </div>
                    <div>
                        <p className={styles.cardLabel}>Academic Health</p>
                        <p className={styles.cardValue} style={{ display: 'flex', alignItems: 'center', gap: 8 }}>
                            Good <span className={`${styles.indicator} ${styles.greenLight}`}></span>
                        </p>
                    </div>
                </div>
            </div>

            <div className={styles.chartsRow}>
                <div className={styles.chartContainer}>
                    <h3 className={styles.chartTitle}>Department-wise Academic Performance</h3>
                    <Bar
                        data={barData}
                        options={{ responsive: true, maintainAspectRatio: false }}
                    />
                </div>
                <HeatmapSection />
            </div>

            <ActionCenter />
        </>
    );

    /* V2 Components */
    const StudentSentinel = () => {
        const [query, setQuery] = useState('');
        const [results, setResults] = useState([]);
        const [showResults, setShowResults] = useState(false);

        const handleSearch = (e) => {
            const val = e.target.value;
            setQuery(val);
            if (val.length > 1) {
                // Mock Search Logic
                const matches = studentsList.filter(s =>
                    s.name.toLowerCase().includes(val.toLowerCase()) ||
                    s.regNo.toLowerCase().includes(val.toLowerCase())
                ).slice(0, 5);
                setResults(matches);
                setShowResults(true);
            } else {
                setShowResults(false);
            }
        };

        return (
            <div className={styles.sentinelContainer}>
                <div style={{ position: 'relative' }}>
                    <Search className={styles.searchIcon} size={18} style={{ position: 'absolute', left: '12px', top: '50%', transform: 'translateY(-50%)', color: '#64748b' }} />
                    <input
                        type="text"
                        className={styles.searchBarInput}
                        placeholder="Search Student..."
                        value={query}
                        onChange={handleSearch}
                        onBlur={() => setTimeout(() => setShowResults(false), 200)}
                    />
                </div>
                {showResults && results.length > 0 && (
                    <div className={styles.searchResultDropdown}>
                        {results.map(student => (
                            <div key={student.id} className={styles.resultItem} onClick={() => alert(`Opening Profile: ${student.name}`)}>
                                <div className={styles.resultAvatar}>{student.name.charAt(0)}</div>
                                <div className={styles.resultInfo}>
                                    <h4>{student.name}</h4>
                                    <p>{student.regNo} | {student.department}</p>
                                </div>
                                <span className={styles.riskBadge}>View</span>
                            </div>
                        ))}
                    </div>
                )}
            </div>
        );
    };

    const PodiumSection = () => {
        const sorted = [...deptRankings].sort((a, b) => b.score - a.score).slice(0, 3);
        return (
            <div className={styles.podiumContainer}>
                {/* Silver - Rank 2 */}
                <div className={`${styles.podiumStep} ${styles.rank2}`}>
                    <Award className={styles.trophyIcon} size={32} color="#e2e8f0" />
                    <div className={styles.podiumScore}>{sorted[1].score}%</div>
                    <div className={styles.podiumLabel}>2. {sorted[1].dept}</div>
                </div>
                {/* Gold - Rank 1 */}
                <div className={`${styles.podiumStep} ${styles.rank1}`}>
                    <Award className={styles.trophyIcon} size={40} color="#fffbeb" />
                    <div className={styles.podiumScore}>{sorted[0].score}%</div>
                    <div className={styles.podiumLabel}>1. {sorted[0].dept}</div>
                </div>
                {/* Bronze - Rank 3 */}
                <div className={`${styles.podiumStep} ${styles.rank3}`}>
                    <Award className={styles.trophyIcon} size={28} color="#ffedd5" />
                    <div className={styles.podiumScore}>{sorted[2].score}%</div>
                    <div className={styles.podiumLabel}>3. {sorted[2].dept}</div>
                </div>
            </div>
        );
    };

    const ActionCenter = () => (
        <div className={styles.glassCard} style={{ marginTop: '2rem' }}>
            <h3 className={styles.chartTitle} style={{ marginBottom: '1rem' }}>Principal Action Center</h3>
            <div className={styles.quickActionsGrid}>
                <button className={styles.actionBtn} onClick={() => alert('Approval Request Sent to HODs')}>
                    <ShieldCheck size={20} color="#2563eb" />
                    <span>Approve Pending IAs</span>
                </button>
                <button className={styles.actionBtn} onClick={() => alert('Report Generated & Downloaded as PDF')}>
                    <FileText size={20} color="#059669" />
                    <span>Download Monthly Report</span>
                </button>
                <button className={styles.actionBtn} onClick={() => alert('Circular Broadcasted to All Faculty')}>
                    <Users size={20} color="#7c3aed" />
                    <span>Broadcast Circular</span>
                </button>
                <button className={styles.actionBtn} onClick={() => alert('Meeting Scheduled with HODs')}>
                    <Calendar size={20} color="#ca8a04" />
                    <span>Schedule HOD Meeting</span>
                </button>
            </div>
        </div>
    );

    const ComplianceSection = () => (
        <div className={styles.tableCard}>
            <h3 className={styles.chartTitle}>HOD IA Submission Status</h3>
            <table className={styles.table}>
                <thead>
                    <tr>
                        <th>Department</th>
                        <th>HOD Name</th>
                        <th>Status</th>
                        <th>Punctuality</th>
                    </tr>
                </thead>
                <tbody>
                    {hodSubmissionStatus.map((item) => (
                        <tr key={item.id}>
                            <td>{item.dept}</td>
                            <td>{item.hod}</td>
                            <td>
                                <span className={`${styles.statusBadge} ${item.status === 'Approved' ? styles.statusApproved : item.status === 'Submitted' ? styles.statusSubmitted : styles.statusPending}`}>
                                    {item.status}
                                </span>
                            </td>
                            <td>
                                <span style={{ color: item.punctuality === 'Delayed' ? '#ef4444' : '#16a34a', fontWeight: 600 }}>
                                    {item.punctuality}
                                </span>
                            </td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    );

    const OutcomesSection = () => (
        <div className={styles.chartsRow}>
            <div className={styles.chartContainer}>
                <h3 className={styles.chartTitle}>5-Year Academic Trend</h3>
                <Line
                    data={academicTrends}
                    options={{ responsive: true, maintainAspectRatio: false }}
                />
            </div>
            <div className={styles.chartContainer}>
                <h3 className={styles.chartTitle}>Attendance vs IA Performance</h3>
                <Scatter
                    data={scatterData}
                    options={{ responsive: true, maintainAspectRatio: false, scales: { x: { title: { display: true, text: 'Attendance %' } }, y: { title: { display: true, text: 'Marks' } } } }}
                />
            </div>
        </div>
    );

    return (
        <div className={styles.dashboardContainer}>
            {/* Sidebar */}
            <aside className={styles.sidebar}>
                <div className={styles.logoSection}>
                    <h2 className={styles.collegeName}>{COLLEGE_DETAILS.name}</h2>
                    <p style={{ fontSize: '0.8rem', opacity: 0.7 }}>Principal Dashboard</p>
                </div>
                <nav className={styles.navMenu}>
                    {menuItems.map(item => (
                        <button
                            key={item.id}
                            className={`${styles.navItem} ${activeTab === item.id ? styles.activeNav : ''}`}
                            onClick={() => setActiveTab(item.id)}
                        >
                            {item.icon} {item.label}
                        </button>
                    ))}
                    <button className={styles.logoutBtn} onClick={() => window.location.href = '/'}>
                        <LogOut size={20} /> Logout
                    </button>
                </nav>
            </aside>

            {/* Main Content */}
            <main className={styles.mainContent} style={{ padding: 0 }}>
                <Ticker />
                <div style={{ padding: '2rem' }}>
                    <header className={styles.header}>
                        <div className={styles.welcomeText}>
                            <h1>Overview</h1>
                            <p>Welcome, Principal Dr. S. Kulkarni</p>
                        </div>
                        <div className={styles.headerActions}>
                            <button
                                className={styles.secondaryBtn}
                                onClick={() => alert("Downloading Full Institute Report...")}
                                style={{ padding: '0.5rem', marginRight: '0.5rem', border: 'none', background: '#ecfdf5', color: '#059669', borderRadius: '8px', cursor: 'pointer' }}
                                title="Download Full Report"
                            >
                                <FileText size={20} />
                            </button>
                            <StudentSentinel />
                            <select className={styles.yearSelector}>
                                <option>Academic Year 2025-26</option>
                                <option>Academic Year 2024-25</option>
                            </select>
                            <div className={styles.cardIcon} style={{ background: 'white', marginBottom: 0 }}>
                                <span style={{ fontWeight: 'bold', color: '#2563eb' }}>SK</span>
                            </div>
                        </div>
                    </header>

                    {/* Dynamic Content */}
                    <div className={styles.sectionVisible}>
                        {activeTab === 'overview' && <OverviewSection />}
                        {activeTab === 'performance' && (
                            <div className={styles.chartContainer} style={{ height: 'auto', minHeight: '500px' }}>
                                <h3 className={styles.chartTitle}>Department Championship Podium</h3>
                                <PodiumSection />
                            </div>
                        )}
                        {activeTab === 'compliance' && <ComplianceSection />}
                        {activeTab === 'outcomes' && <OutcomesSection />}
                    </div>
                </div>
            </main>
        </div>
    );
};

export default PrincipalDashboard;
