import React from 'react';
import { NavLink } from 'react-router-dom';
import { useAuth } from '../context/AuthContext';
// import { useTheme } from '../context/ThemeContext';
import styles from './Sidebar.module.css';
import { LogOut } from 'lucide-react';
import collegeLogo from '../assets/college_logo.png';

const Sidebar = ({ menuItems }) => {
    const { user, logout } = useAuth();
    // const { isDarkMode, toggleTheme } = useTheme(); 

    return (
        <aside className={styles.sidebar}>
            <div className={styles.logoSection}>
                <img src={collegeLogo} alt="SGP Logo" className={styles.sidebarLogo} />
            </div>

            <div className={styles.userInfo}>
                <div className={styles.avatar}>
                    {user?.name?.charAt(0)}
                </div>
                <div className={styles.userDetails}>
                    <p className={styles.userName}>{user?.name}</p>
                    <p className={styles.userRole}>{user?.role?.toUpperCase()}</p>
                </div>
            </div>

            <nav className={styles.nav}>
                {menuItems.map((item) => (
                    <NavLink
                        key={item.label}
                        to={item.path}
                        className={({ isActive }) =>
                            (item.isActive ?? isActive) ? `${styles.navItem} ${styles.active}` : styles.navItem
                        }
                        onClick={(e) => {
                            if (item.onClick) {
                                e.preventDefault();
                                item.onClick();
                            }
                        }}
                        end
                    >
                        {item.icon}
                        <span>{item.label}</span>
                    </NavLink>
                ))}
            </nav>

            <button onClick={logout} className={styles.logoutButton}>
                <LogOut size={20} />
                <span>Logout</span>
            </button>
        </aside>
    );
};

export default Sidebar;
