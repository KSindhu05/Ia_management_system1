import React, { useState } from 'react';
import Sidebar from './Sidebar';
import styles from './DashboardLayout.module.css';
import NotificationPanel from './NotificationPanel';
import { Bell } from 'lucide-react';

const DashboardLayout = ({ menuItems, children }) => {
    const [showNotifications, setShowNotifications] = useState(false);

    return (
        <div className={styles.layout}>
            <Sidebar menuItems={menuItems} />
            <main className={styles.mainContent}>
                {children}

                {/* Floating Notification Bell */}
                <button
                    className={styles.notificationBtn}
                    onClick={() => setShowNotifications(!showNotifications)}
                    title="Notifications"
                >
                    <Bell size={24} />
                    {/* Optional: Add badge here if unread count is available globally */}
                </button>

                {showNotifications && (
                    <NotificationPanel onClose={() => setShowNotifications(false)} />
                )}
            </main>
        </div>
    );
};

export default DashboardLayout;
