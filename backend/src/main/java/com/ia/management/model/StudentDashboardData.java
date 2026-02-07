package com.ia.management.model;

import java.util.List;

public class StudentDashboardData {
    private StudentProfile profile;
    private List<CIEMark> marks;
    private List<Exam> upcomingExams;
    private List<Notification> notifications;
    private List<Achievement> achievements;

    public StudentDashboardData() {}

    public StudentDashboardData(StudentProfile profile, List<CIEMark> marks, List<Exam> upcomingExams, List<Notification> notifications, List<Achievement> achievements) {
        this.profile = profile;
        this.marks = marks;
        this.upcomingExams = upcomingExams;
        this.notifications = notifications;
        this.achievements = achievements;
    }

    public static StudentDashboardDataBuilder builder() { return new StudentDashboardDataBuilder(); }

    public StudentProfile getProfile() { return profile; }
    public void setProfile(StudentProfile profile) { this.profile = profile; }
    public List<CIEMark> getMarks() { return marks; }
    public void setMarks(List<CIEMark> marks) { this.marks = marks; }
    public List<Exam> getUpcomingExams() { return upcomingExams; }
    public void setUpcomingExams(List<Exam> upcomingExams) { this.upcomingExams = upcomingExams; }
    public List<Notification> getNotifications() { return notifications; }
    public void setNotifications(List<Notification> notifications) { this.notifications = notifications; }
    public List<Achievement> getAchievements() { return achievements; }
    public void setAchievements(List<Achievement> achievements) { this.achievements = achievements; }

    public static class StudentDashboardDataBuilder {
        private StudentProfile profile;
        private List<CIEMark> marks;
        private List<Exam> upcomingExams;
        private List<Notification> notifications;
        private List<Achievement> achievements;

        public StudentDashboardDataBuilder profile(StudentProfile profile) { this.profile = profile; return this; }
        public StudentDashboardDataBuilder marks(List<CIEMark> marks) { this.marks = marks; return this; }
        public StudentDashboardDataBuilder upcomingExams(List<Exam> upcomingExams) { this.upcomingExams = upcomingExams; return this; }
        public StudentDashboardDataBuilder notifications(List<Notification> notifications) { this.notifications = notifications; return this; }
        public StudentDashboardDataBuilder achievements(List<Achievement> achievements) { this.achievements = achievements; return this; }
        public StudentDashboardData build() { return new StudentDashboardData(profile, marks, upcomingExams, notifications, achievements); }
    }

    public static class StudentProfile {
        private String name;
        private String rollNo;
        private String branch;
        private String semester;
        private int attendance;
        private double cgpa;

        public StudentProfile() {}
        public StudentProfile(String name, String rollNo, String branch, String semester, int attendance, double cgpa) {
            this.name = name;
            this.rollNo = rollNo;
            this.branch = branch;
            this.semester = semester;
            this.attendance = attendance;
            this.cgpa = cgpa;
        }
        public static StudentProfileBuilder builder() { return new StudentProfileBuilder(); }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getRollNo() { return rollNo; }
        public void setRollNo(String rollNo) { this.rollNo = rollNo; }
        public String getBranch() { return branch; }
        public void setBranch(String branch) { this.branch = branch; }
        public String getSemester() { return semester; }
        public void setSemester(String semester) { this.semester = semester; }
        public int getAttendance() { return attendance; }
        public void setAttendance(int attendance) { this.attendance = attendance; }
        public double getCgpa() { return cgpa; }
        public void setCgpa(double cgpa) { this.cgpa = cgpa; }

        public static class StudentProfileBuilder {
            private String name;
            private String rollNo;
            private String branch;
            private String semester;
            private int attendance;
            private double cgpa;

            public StudentProfileBuilder name(String name) { this.name = name; return this; }
            public StudentProfileBuilder rollNo(String rollNo) { this.rollNo = rollNo; return this; }
            public StudentProfileBuilder branch(String branch) { this.branch = branch; return this; }
            public StudentProfileBuilder semester(String semester) { this.semester = semester; return this; }
            public StudentProfileBuilder attendance(int attendance) { this.attendance = attendance; return this; }
            public StudentProfileBuilder cgpa(double cgpa) { this.cgpa = cgpa; return this; }
            public StudentProfile build() { return new StudentProfile(name, rollNo, branch, semester, attendance, cgpa); }
        }
    }

    public static class CIEMark {
        private int id;
        private String subject;
        private String code;
        private int cie1;
        private int cie2;
        private int cie3;
        private int avg;
        private String status;

        public CIEMark() {}
        public CIEMark(int id, String subject, String code, int cie1, int cie2, int cie3, int avg, String status) {
            this.id = id;
            this.subject = subject;
            this.code = code;
            this.cie1 = cie1;
            this.cie2 = cie2;
            this.cie3 = cie3;
            this.avg = avg;
            this.status = status;
        }
        public static CIEMarkBuilder builder() { return new CIEMarkBuilder(); }
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getSubject() { return subject; }
        public void setSubject(String subject) { this.subject = subject; }
        public String getCode() { return code; }
        public void setCode(String code) { this.code = code; }
        public int getCie1() { return cie1; }
        public void setCie1(int cie1) { this.cie1 = cie1; }
        public int getCie2() { return cie2; }
        public void setCie2(int cie2) { this.cie2 = cie2; }
        public int getCie3() { return cie3; }
        public void setCie3(int cie3) { this.cie3 = cie3; }
        public int getAvg() { return avg; }
        public void setAvg(int avg) { this.avg = avg; }
        public String getStatus() { return status; }
        public void setStatus(String status) { this.status = status; }

        public static class CIEMarkBuilder {
            private int id;
            private String subject;
            private String code;
            private int cie1;
            private int cie2;
            private int cie3;
            private int avg;
            private String status;

            public CIEMarkBuilder id(int id) { this.id = id; return this; }
            public CIEMarkBuilder subject(String subject) { this.subject = subject; return this; }
            public CIEMarkBuilder code(String code) { this.code = code; return this; }
            public CIEMarkBuilder cie1(int cie1) { this.cie1 = cie1; return this; }
            public CIEMarkBuilder cie2(int cie2) { this.cie2 = cie2; return this; }
            public CIEMarkBuilder cie3(int cie3) { this.cie3 = cie3; return this; }
            public CIEMarkBuilder avg(int avg) { this.avg = avg; return this; }
            public CIEMarkBuilder status(String status) { this.status = status; return this; }
            public CIEMark build() { return new CIEMark(id, subject, code, cie1, cie2, cie3, avg, status); }
        }
    }

    public static class Exam {
        private int id;
        private String exam;
        private String subject;
        private String date;
        private String time;

        public Exam() {}
        public Exam(int id, String exam, String subject, String date, String time) {
            this.id = id;
            this.exam = exam;
            this.subject = subject;
            this.date = date;
            this.time = time;
        }
        public static ExamBuilder builder() { return new ExamBuilder(); }
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getExam() { return exam; }
        public void setExam(String exam) { this.exam = exam; }
        public String getSubject() { return subject; }
        public void setSubject(String subject) { this.subject = subject; }
        public String getDate() { return date; }
        public void setDate(String date) { this.date = date; }
        public String getTime() { return time; }
        public void setTime(String time) { this.time = time; }

        public static class ExamBuilder {
            private int id;
            private String exam;
            private String subject;
            private String date;
            private String time;
            public ExamBuilder id(int id) { this.id = id; return this; }
            public ExamBuilder exam(String exam) { this.exam = exam; return this; }
            public ExamBuilder subject(String subject) { this.subject = subject; return this; }
            public ExamBuilder date(String date) { this.date = date; return this; }
            public ExamBuilder time(String time) { this.time = time; return this; }
            public Exam build() { return new Exam(id, exam, subject, date, time); }
        }
    }

    public static class Notification {
        private int id;
        private String message;
        private String time;
        private String type;

        public Notification() {}
        public Notification(int id, String message, String time, String type) {
            this.id = id;
            this.message = message;
            this.time = time;
            this.type = type;
        }
        public static NotificationBuilder builder() { return new NotificationBuilder(); }
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getMessage() { return message; }
        public void setMessage(String message) { this.message = message; }
        public String getTime() { return time; }
        public void setTime(String time) { this.time = time; }
        public String getType() { return type; }
        public void setType(String type) { this.type = type; }

        public static class NotificationBuilder {
            private int id;
            private String message;
            private String time;
            private String type;
            public NotificationBuilder id(int id) { this.id = id; return this; }
            public NotificationBuilder message(String message) { this.message = message; return this; }
            public NotificationBuilder time(String time) { this.time = time; return this; }
            public NotificationBuilder type(String type) { this.type = type; return this; }
            public Notification build() { return new Notification(id, message, time, type); }
        }
    }

    public static class Achievement {
        private int id;
        private String title;
        private String desc;
        private String icon;

        public Achievement() {}
        public Achievement(int id, String title, String desc, String icon) {
            this.id = id;
            this.title = title;
            this.desc = desc;
            this.icon = icon;
        }
        public static AchievementBuilder builder() { return new AchievementBuilder(); }
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getTitle() { return title; }
        public void setTitle(String title) { this.title = title; }
        public String getDesc() { return desc; }
        public void setDesc(String desc) { this.desc = desc; }
        public String getIcon() { return icon; }
        public void setIcon(String icon) { this.icon = icon; }

        public static class AchievementBuilder {
            private int id;
            private String title;
            private String desc;
            private String icon;
            public AchievementBuilder id(int id) { this.id = id; return this; }
            public AchievementBuilder title(String title) { this.title = title; return this; }
            public AchievementBuilder desc(String desc) { this.desc = desc; return this; }
            public AchievementBuilder icon(String icon) { this.icon = icon; return this; }
            public Achievement build() { return new Achievement(id, title, desc, icon); }
        }
    }
}
