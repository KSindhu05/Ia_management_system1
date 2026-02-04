export const studentData = {
    id: 'CS001',
    name: 'A KAVITHA',
    rollNo: '459CS25001',
    branch: 'Computer Science & Engineering',
    semester: '2nd',
    attendance: 85,
    profileImage: null,
};

export const departments = [
    { id: 'CS', name: 'Computer Science & Engineering', hod: 'MD Jaffar', isUserDept: true },
    { id: 'ME', name: 'Mechanical', hod: 'Prof. A. Singh', isUserDept: false },
    { id: 'EE', name: 'Electrical', hod: 'Prof. K. Reddy', isUserDept: false },
    { id: 'CV', name: 'Civil', hod: 'Prof. M. Gowda', isUserDept: false },
    { id: 'MME', name: 'Metallurgical', hod: 'Prof. S. Bose', isUserDept: false },
];

export const hodData = {
    name: 'MD Jaffar',
    department: 'Computer Science & Engineering',
    image: null
};

export const subjectsByDept = {
    'CS': ['Engineering Maths-II', 'English Communication', 'CAEG', 'Python'],
    'EE': ['Circuit Analysis', 'Transformers', 'Power Systems', 'Analog Electronics', 'Control Systems'],
    'ME': ['Thermodynamics', 'Fluid Mechanics', 'Machine Design', 'Heat Transfer', 'Manufacturing Process'],
    'CV': ['Surveying', 'Structural Analysis', 'Geotech Engg', 'Hydraulics', 'Concrete Tech'],
    'MME': ['Physical Metallurgy', 'Iron & Steel Making', 'Corrosion Engg', 'Foundry Tech', 'Material Science']
};

const firstNames = [
    'Rahul', 'Anjali', 'Vikram', 'Neha', 'Arjun', 'Kavita', 'Rohan', 'Ishita', 'Siddharth', 'Pooja',
    'Aditya', 'Meera', 'Varun', 'Simran', 'Aakash', 'Riya', 'Karan', 'Sneha', 'Manish', 'Tanvi',
    'Abhinav', 'Bhavna', 'Chetan', 'Divya', 'Esha', 'Farhan', 'Gaurav', 'Hina', 'Imran', 'Jhanvi',
    'Kunal', 'Latika', 'Mohit', 'Nikhil', 'Omkar', 'Pranav', 'Qasim', 'Rashmi', 'Sameer', 'Tina',
    'Uday', 'Vani', 'Wasim', 'Xavier', 'Yash', 'Zara', 'David', 'Ben', 'Charlie', 'Alice',
    'Mohammed', 'Fatima', 'Yusuf', 'Aisha', 'Bilal', 'Zainab', 'Omar', 'Sana', 'Ali', 'Mariam'
];
const lastNames = [
    'Sharma', 'Gupta', 'Singh', 'Reddy', 'Verma', 'Krishnan', 'Mehta', 'Patel', 'Rao', 'Nair',
    'Kumar', 'Sen', 'Chawla', 'Kaur', 'Deep', 'Deshmukh', 'Malhotra', 'Joshi', 'Bhat', 'Saxena',
    'Yadav', 'Das', 'Iyer', 'Menon', 'Chopra', 'Kapoor', 'Agarwal', 'Bansal', 'Dubey', 'Tiwari',
    'Khan', 'Ahmed', 'Shaikh', 'Begum', 'Hussain', 'Siddiqui', 'Ali', 'Pathan', 'Mirza', 'Qureshi'
];

const getRandom = (arr) => arr[Math.floor(Math.random() * arr.length)];

const realCSStudents = [
    { regNo: '459CS25001', name: 'A KAVITHA' },
    { regNo: '459CS25002', name: 'ABHISHEKA' },
    { regNo: '459CS25003', name: 'ADARSH REDDY G' },
    { regNo: '459CS25004', name: 'AGASARA KEERTHANA' },
    { regNo: '459CS25005', name: 'AKHIL S' },
    { regNo: '459CS25006', name: 'AKULA SHASHI KUMAR' },
    { regNo: '459CS25007', name: 'ANAPA LEELA LASYA LAHARI' },
    { regNo: '459CS25008', name: 'ANKITH C' },
    { regNo: '459CS25009', name: 'ANUSHA' },
    { regNo: '459CS25010', name: 'B GURU SAI CHARAN' },
    { regNo: '459CS25011', name: 'B SREENATH' },
    { regNo: '459CS25012', name: 'B VAMSHI' },
    { regNo: '459CS25013', name: 'BASAVARAJA' },
    { regNo: '459CS25014', name: 'BEBE KHUTEJA' },
    { regNo: '459CS25015', name: 'BHUMIKA K' },
    { regNo: '459CS25016', name: 'C ABHINAV' },
    { regNo: '459CS25017', name: 'C D ANNAPOORNA' },
    { regNo: '459CS25018', name: 'C JEEVAN KUMAR' },
    { regNo: '459CS25019', name: 'D LIKHITA' },
    { regNo: '459CS25020', name: 'D PREM KUMAR' },
    { regNo: '459CS25021', name: 'D S YASHODA' },
    { regNo: '459CS25022', name: 'DARSHANI' },
    { regNo: '459CS25023', name: 'DARUR KAVYA' },
    { regNo: '459CS25024', name: 'DASHAVANTH' },
    { regNo: '459CS25025', name: 'DHANESHWARI' },
    { regNo: '459CS25026', name: 'FIRDOUS D' },
    { regNo: '459CS25027', name: 'G ANUSRI' },
    { regNo: '459CS25028', name: 'G M VISHWANATH' },
    { regNo: '459CS25029', name: 'GAGANA PATIL' },
    { regNo: '459CS25030', name: 'GANGULA KUSHAL SAI' },
    { regNo: '459CS25031', name: 'GOUTHAM HEGADE K S' },
    { regNo: '459CS25032', name: 'GOUTHAMI' },
    { regNo: '459CS25033', name: 'GULAM MUSTAFA KHAN' },
    { regNo: '459CS25034', name: 'H D NANDISH NAIK' },
    { regNo: '459CS25035', name: 'H VINAYA PATIL' },
    { regNo: '459CS25036', name: 'HALLI SIDDANA GOUDU' },
    { regNo: '459CS25037', name: 'HANUMANTHA REDDY' },
    { regNo: '459CS25038', name: 'HARI CHARAN K' },
    { regNo: '459CS25039', name: 'HEMANT DWIVEDI' },
    { regNo: '459CS25040', name: 'J SHIVASHANKAR' },
    { regNo: '459CS25041', name: 'K ABHILASH' },
    { regNo: '459CS25042', name: 'K ANANDA' },
    { regNo: '459CS25043', name: 'K HARI PRASAD REDDY' },
    { regNo: '459CS25044', name: 'K JASHWANTH GOWDA' },
    { regNo: '459CS25045', name: 'K JEETHENDRA REDDY' },
    { regNo: '459CS25046', name: 'K KAVYA' },
    { regNo: '459CS25047', name: 'K M MEGHANA' },
    { regNo: '459CS25048', name: 'K MOUNIKA' },
    { regNo: '459CS25049', name: 'K PRAVEEN KUMAR' },
    { regNo: '459CS25050', name: 'K THARUN' },
    { regNo: '459CS25051', name: 'K VINAY' },
    { regNo: '459CS25052', name: 'KEERTHANA M' },
    { regNo: '459CS25053', name: 'KYADHARI KAVYASRI' },
    { regNo: '459CS25054', name: 'LAKSHA R' },
    { regNo: '459CS25055', name: 'LAKSHMI S' },
    { regNo: '459CS25056', name: 'M AAMIR HAMZA' },
    { regNo: '459CS25057', name: 'M MAHESHA' },
    { regNo: '459CS25058', name: 'M S MOHAMMAD ISMAIL' },
    { regNo: '459CS25059', name: 'M S POORVI' },
    { regNo: '459CS25060', name: 'MAHADEVI V' },
    { regNo: '459CS25061', name: 'MANEESHA V M' },
    { regNo: '459CS25062', name: 'MARESHA Y' },
    { regNo: '459CS25063', name: 'MARUTHI H' }
];

export const getStudentsByDept = (deptId) => {
    // Use Real Data for CS
    if (deptId === 'CS') {
        return realCSStudents.map((student, index) => {
            const i = index + 1;
            // Determine section based on user request or split
            // Sheet says "SEM: II - A/S", let's assume A Section for these 63 students
            // But we typically split 120/60. Here we have 63. Let's put all in A or split?
            // "A/S" likely means A Section.
            // Let's just put all in 'A' for now since it's a specific list.

            return {
                id: `${deptId}${String(i).padStart(3, '0')}`,
                regNo: student.regNo,
                rollNo: student.regNo, // Use Reg No as Roll No
                name: student.name,
                sem: '2nd', // Updated to 2nd Sem
                section: 'A',
                batch: i <= 30 ? 'B1' : 'B2',
                marks: {
                    // Mock marks for now, as manual entry of 250+ scores is not feasible via tool in one go
                    // The user asked to "change the all date students", implying names/identities primarily.
                    // If marks are critical we would need OCR or raw text data.
                    // We will randomize reasonable scores.
                    ia1: Math.floor(Math.random() * 16) + 15,
                    ia2: Math.floor(Math.random() * 21) + 10,
                    ia3: 0
                },
                attendance: Math.floor(Math.random() * 20) + 80, // 80-100%
            };
        });
    }

    // Fallback for other departments (Random Generation)
    const count = 120; // Generate 120 students per department

    // Step 1: Generate Names
    let nameList = [];
    for (let i = 0; i < count; i++) {
        nameList.push(`${getRandom(firstNames)} ${getRandom(lastNames)}`);
    }

    // Step 2: Sort Names Alphabetically
    nameList.sort();

    const collegeCode = '459';
    const year = '23';
    const prefix = `${collegeCode}${deptId}${year}`; // e.g., 459CS23

    // Step 3: Create Student Objects with Sequential IDs based on Sorted Names
    const students = nameList.map((studentName, index) => {
        const i = index + 1; // 1-based index
        const generatedRegNo = `${prefix}${String(i).padStart(3, '0')}`;

        let section = 'A';
        let batch = 'B1';

        if (i <= 60) {
            section = 'A';
            batch = i <= 30 ? 'B1' : 'B2';
        } else {
            section = 'B';
            batch = i <= 90 ? 'B1' : 'B2';
        }

        return {
            id: `${deptId}${String(i).padStart(3, '0')}`,
            regNo: generatedRegNo,
            rollNo: generatedRegNo, // Ensure compatibility with components using rollNo
            name: studentName,
            sem: '5th',
            section: section,
            batch: batch,
            marks: {
                ia1: Math.floor(Math.random() * 16) + 15, // 15-30 (Good marks)
                ia2: Math.floor(Math.random() * 21) + 10, // 10-30 (Varied)
                ia3: 0
            },
            attendance: Math.floor(Math.random() * 30) + 70, // 70-100%
        };
    });

    return students;
};

// Initial calls to populate stats
export const studentsList = getStudentsByDept('CS');

export const departmentStats = {
    totalStudents: 63, // Matching the real list
    facultyCount: 5,
    topPerformer: 'A KAVITHA', // Using a real name
    atRiskCount: 3
};

export const facultyData = {
    id: 'F001',
    name: 'Dr. Suresh Kumar',
    designation: 'Assistant Professor',
    department: 'Computer Science & Engineering',
    email: 'suresh.kumar@college.edu',
    phone: '+91 98765 43210'
};

export const facultySubjects = [
    { id: 'SUB001', name: 'Engineering Maths-II', code: '20SC01T', type: 'Theory', semester: '2nd', studentCount: 63, co1MaxMarks: 35, co2MaxMarks: 15, totalMaxMarks: 50 },
    { id: 'SUB002', name: 'English Communication', code: '20EG01T', type: 'Theory', semester: '2nd', studentCount: 63, co1MaxMarks: 50, co2MaxMarks: 0, totalMaxMarks: 50 },
    { id: 'SUB003', name: 'Python', code: '20CS21P', type: 'Lab', semester: '2nd', studentCount: 63, co1MaxMarks: 25, co2MaxMarks: 25, totalMaxMarks: 50 }
];

export const facultyClassAnalytics = {
    avgScore: 72,
    passRate: 94,
    evaluated: 105,
    pending: 15,
    lowPerformers: 8,
    topPerformers: 15
};

export const labSchedule = [
    { id: 1, day: 'Monday', time: '2:00 PM - 5:00 PM', lab: 'Web Tech Lab', batch: 'B1' },
    { id: 2, day: 'Wednesday', time: '9:00 AM - 12:00 PM', lab: 'Java Lab', batch: 'B2' },
    { id: 3, day: 'Friday', time: '10:00 AM - 1:00 PM', lab: 'Software Engg Lab', batch: 'B1' }
];

export const recentActivities = [
    { id: 1, text: 'IA-2 Marks uploaded for Software Engineering', time: '2 hours ago', type: 'upload' },
    { id: 2, text: 'Attendance low for Lab Session (Wed)', time: '1 day ago', type: 'alert' },
    { id: 3, text: 'Meeting scheduled with HOD', time: '2 days ago', type: 'info' }
];

export const atRiskStudents = [
    { id: 'CS001', name: 'A KAVITHA', rollNo: '459CS25001', avgMarks: 12, attendance: 65, issue: 'Low Attendance' },
    { id: 'CS002', name: 'ABHISHEKA', rollNo: '459CS25002', avgMarks: 9, attendance: 70, issue: 'Failed in IA-1' },
    { id: 'CS003', name: 'ADARSH REDDY G', rollNo: '459CS25003', avgMarks: 11, attendance: 55, issue: 'Severe Risk' }
];


// --- RESTORED MOCK DATA FOR HOD DASHBOARD ---

export const hodBranchComparison = {
    labels: ['CS', 'EC', 'ME', 'CV', 'EE'],
    datasets: [
        {
            label: 'Avg IA Score',
            data: [75, 78, 72, 70, 74],
            backgroundColor: 'rgba(59, 130, 246, 0.5)',
        }
    ]
};

export const departmentAlerts = [
    { id: 1, message: 'Low attendance in 3rd Year', type: 'warning' },
    { id: 2, message: 'IA-1 Marks submission pending for 2 subjects', type: 'error' }
];

export const resourceRequests = [
    { id: 1, resource: 'Projector', status: 'Pending', requester: 'Prof. A' },
    { id: 2, resource: 'Lab PC Repair', status: 'Approved', requester: 'Prof. B' }
];

export const hodTrendData = {
    labels: ['2021', '2022', '2023'],
    datasets: [
        {
            label: 'Pass Percentage',
            data: [88, 92, 94],
            borderColor: 'rgb(75, 192, 192)',
            tension: 0.1
        }
    ]
};

export const hodGradeDistribution = {
    labels: ['A+', 'A', 'B', 'C', 'F'],
    datasets: [
        {
            data: [15, 30, 35, 15, 5],
            backgroundColor: ['#10b981', '#3b82f6', '#f59e0b', '#ef4444', '#6b7280']
        }
    ]
};

export const facultyWorkload = [
    { id: 1, name: 'Dr. Suresh', classes: 12, labs: 4 },
    { id: 2, name: 'Prof. Anjali', classes: 10, labs: 6 },
    { id: 3, name: 'Prof. Vikram', classes: 14, labs: 2 }
];

export const branchPerformanceData = {
    labels: ['Sem 3', 'Sem 5', 'Sem 7'],
    datasets: [{ label: 'Performance', data: [72, 78, 74], backgroundColor: '#8b5cf6' }]
};

export const iaSubmissionStatus = {
    labels: ['Submitted', 'Pending'],
    datasets: [{ data: [85, 15], backgroundColor: ['#10b981', '#ef4444'] }]
};



// --- RESTORED MOCK DATA FOR PRINCIPAL DASHBOARD ---

export const collegeStats = {
    passFailData: [850, 150], // Passed, Failed count
    branches: ['CS', 'EC', 'ME', 'CV', 'EE'],
    branchPerformance: [78, 72, 68, 74, 70] // Average percentages
};

export const principalStats = {
    totalStudents: 1250,
    placementRate: 85,
    feeCollection: '?1.2 Cr',
    avgAttendance: 76
};

export const broadcastMessages = [
    { id: 1, message: 'Faculty Meeting at 3 PM', target: 'All Faculty', date: 'Today, 10:00 AM' },
    { id: 2, message: 'Submit IA-1 Marks by Friday', target: 'HODs', date: 'Yesterday' }
];

export const principalSchedule = [
    { id: 1, time: '10:00 AM', title: 'Meeting with Trust Board', type: 'Urgent' },
    { id: 2, time: '02:00 PM', title: 'Campus Inspection', type: 'Routine' },
    { id: 3, time: '04:30 PM', title: 'Review Dept Reports', type: 'Routine' }
];


export const COLLEGE_DETAILS = {
    name: 'Sanjay Gandhi Polytechnic',
    branches: ['Computer Science', 'Mechanical Engineering', 'Electrical Engineering', 'Civil Engineering', 'Metallurgical Engineering']
};

export const hodSubmissionStatus = [
    { id: 'CS', dept: 'Computer Science', hod: 'MD Jaffar', status: 'Approved', punctuality: 'On Time' },
    { id: 'ME', dept: 'Mechanical', hod: 'Prof. A. Singh', status: 'Pending', punctuality: 'Delayed' },
    { id: 'EE', dept: 'Electrical', hod: 'Prof. K. Reddy', status: 'Approved', punctuality: 'On Time' },
    { id: 'CV', dept: 'Civil', hod: 'Prof. M. Gowda', status: 'Submitted', punctuality: 'On Time' },
    { id: 'MME', dept: 'Metallurgical', hod: 'Prof. S. Bose', status: 'Pending', punctuality: 'Delayed' }
];

export const academicTrends = {
    labels: ['2021', '2022', '2023', '2024', '2025'],
    datasets: [
        {
            label: 'Average IA Score',
            data: [68, 72, 74, 71, 78],
            borderColor: '#3b82f6',
            tension: 0.4
        }
    ]
};

export const deptRankings = [
    { rank: 1, dept: 'Computer Science', score: 78, change: 'up' },
    { rank: 2, dept: 'Civil Engineering', score: 74, change: 'down' },
    { rank: 3, dept: 'Electrical Engineering', score: 70, change: 'same' },
    { rank: 4, dept: 'Mechanical Engineering', score: 68, change: 'up' },
    { rank: 5, dept: 'Metallurgical Engineering', score: 65, change: 'down' }
];

export const attendanceCorrelation = Array.from({ length: 50 }, (_, i) => ({
    x: Math.floor(Math.random() * 40) + 60, // Attendance 60-100%
    y: Math.floor(Math.random() * 30) + 50  // Marks 50-80
}));

// --- PRINCIPAL DASHBOARD V2 DATA ---

export const aiInsights = [
    "⚠️ Anomaly Detected: 3rd Semester Mechanical attendance dropped by 12% compared to last week.",
    "📈 Positive Trend: Computer Science Dept has achieved 100% IA-2 submission compliance.",
    "🤖 Prediction: Based on current trends, Civil Engineering pass rate is projected to increase by 5%.",
    "🔔 Reminder: IA-3 for Electrical Engineering is scheduled to begin in 4 days."
];

export const liveTickerData = [
    { time: '10:45 AM', msg: 'Dr. Suresh uploaded IA-2 Marks for CS Dept' },
    { time: '11:00 AM', msg: 'Principal Approved: Holiday Circular for Dec 25th' },
    { time: '11:15 AM', msg: 'Attendance Report Generated: 92% College-wide presence' },
    { time: '11:30 AM', msg: 'System Alert: Server Maintenance Scheduled for Sunday' },
    { time: '12:00 PM', msg: 'New Feedback Received: 15 Student Grievances Logged' }
];

// Generate 10x12 Grid for Heatmap (120 Students)
export const heatmapData = Array.from({ length: 120 }, (_, i) => ({
    id: i,
    score: Math.floor(Math.random() * 50) + 50, // Score 50-100
    status: Math.random() > 0.8 ? 'Risk' : (Math.random() > 0.5 ? 'Average' : 'Excellent')
}));
