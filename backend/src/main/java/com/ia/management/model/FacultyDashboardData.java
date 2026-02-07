package com.ia.management.model;

import java.util.List;

public class FacultyDashboardData {
    private FacultyProfile profile;
    private List<Subject> subjects;
    private ClassAnalytics analytics;
    private List<LabSchedule> labSchedule;

    public FacultyDashboardData() {}

    public FacultyDashboardData(FacultyProfile profile, List<Subject> subjects, ClassAnalytics analytics, List<LabSchedule> labSchedule) {
        this.profile = profile;
        this.subjects = subjects;
        this.analytics = analytics;
        this.labSchedule = labSchedule;
    }

    public static FacultyDashboardDataBuilder builder() { return new FacultyDashboardDataBuilder(); }

    public FacultyProfile getProfile() { return profile; }
    public void setProfile(FacultyProfile profile) { this.profile = profile; }

    public List<Subject> getSubjects() { return subjects; }
    public void setSubjects(List<Subject> subjects) { this.subjects = subjects; }

    public ClassAnalytics getAnalytics() { return analytics; }
    public void setAnalytics(ClassAnalytics analytics) { this.analytics = analytics; }

    public List<LabSchedule> getLabSchedule() { return labSchedule; }
    public void setLabSchedule(List<LabSchedule> labSchedule) { this.labSchedule = labSchedule; }

    public static class FacultyDashboardDataBuilder {
        private FacultyProfile profile;
        private List<Subject> subjects;
        private ClassAnalytics analytics;
        private List<LabSchedule> labSchedule;

        public FacultyDashboardDataBuilder profile(FacultyProfile profile) { this.profile = profile; return this; }
        public FacultyDashboardDataBuilder subjects(List<Subject> subjects) { this.subjects = subjects; return this; }
        public FacultyDashboardDataBuilder analytics(ClassAnalytics analytics) { this.analytics = analytics; return this; }
        public FacultyDashboardDataBuilder labSchedule(List<LabSchedule> labSchedule) { this.labSchedule = labSchedule; return this; }
        public FacultyDashboardData build() { return new FacultyDashboardData(profile, subjects, analytics, labSchedule); }
    }

    public static class FacultyProfile {
        private String name;
        private String designation;
        private String department;

        public FacultyProfile() {}
        public FacultyProfile(String name, String designation, String department) {
            this.name = name;
            this.designation = designation;
            this.department = department;
        }

        public static FacultyProfileBuilder builder() { return new FacultyProfileBuilder(); }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getDesignation() { return designation; }
        public void setDesignation(String designation) { this.designation = designation; }
        public String getDepartment() { return department; }
        public void setDepartment(String department) { this.department = department; }

        public static class FacultyProfileBuilder {
            private String name;
            private String designation;
            private String department;

            public FacultyProfileBuilder name(String name) { this.name = name; return this; }
            public FacultyProfileBuilder designation(String designation) { this.designation = designation; return this; }
            public FacultyProfileBuilder department(String department) { this.department = department; return this; }
            public FacultyProfile build() { return new FacultyProfile(name, designation, department); }
        }
    }

    public static class Subject {
        private int id;
        private String name;
        private String semester;
        private int studentCount;

        public Subject() {}
        public Subject(int id, String name, String semester, int studentCount) {
            this.id = id;
            this.name = name;
            this.semester = semester;
            this.studentCount = studentCount;
        }

        public static SubjectBuilder builder() { return new SubjectBuilder(); }

        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getSemester() { return semester; }
        public void setSemester(String semester) { this.semester = semester; }
        public int getStudentCount() { return studentCount; }
        public void setStudentCount(int studentCount) { this.studentCount = studentCount; }

        public static class SubjectBuilder {
            private int id;
            private String name;
            private String semester;
            private int studentCount;

            public SubjectBuilder id(int id) { this.id = id; return this; }
            public SubjectBuilder name(String name) { this.name = name; return this; }
            public SubjectBuilder semester(String semester) { this.semester = semester; return this; }
            public SubjectBuilder studentCount(int studentCount) { this.studentCount = studentCount; return this; }
            public Subject build() { return new Subject(id, name, semester, studentCount); }
        }
    }

    public static class ClassAnalytics {
        private int totalStudents;
        private int evaluated;
        private int pending;
        private int avgScore;
        private int lowPerformers;
        private int topPerformers;

        public ClassAnalytics() {}
        public ClassAnalytics(int totalStudents, int evaluated, int pending, int avgScore, int lowPerformers, int topPerformers) {
            this.totalStudents = totalStudents;
            this.evaluated = evaluated;
            this.pending = pending;
            this.avgScore = avgScore;
            this.lowPerformers = lowPerformers;
            this.topPerformers = topPerformers;
        }

        public static ClassAnalyticsBuilder builder() { return new ClassAnalyticsBuilder(); }

        public int getTotalStudents() { return totalStudents; }
        public void setTotalStudents(int totalStudents) { this.totalStudents = totalStudents; }
        public int getEvaluated() { return evaluated; }
        public void setEvaluated(int evaluated) { this.evaluated = evaluated; }
        public int getPending() { return pending; }
        public void setPending(int pending) { this.pending = pending; }
        public int getAvgScore() { return avgScore; }
        public void setAvgScore(int avgScore) { this.avgScore = avgScore; }
        public int getLowPerformers() { return lowPerformers; }
        public void setLowPerformers(int lowPerformers) { this.lowPerformers = lowPerformers; }
        public int getTopPerformers() { return topPerformers; }
        public void setTopPerformers(int topPerformers) { this.topPerformers = topPerformers; }

        public static class ClassAnalyticsBuilder {
            private int totalStudents;
            private int evaluated;
            private int pending;
            private int avgScore;
            private int lowPerformers;
            private int topPerformers;

            public ClassAnalyticsBuilder totalStudents(int totalStudents) { this.totalStudents = totalStudents; return this; }
            public ClassAnalyticsBuilder evaluated(int evaluated) { this.evaluated = evaluated; return this; }
            public ClassAnalyticsBuilder pending(int pending) { this.pending = pending; return this; }
            public ClassAnalyticsBuilder avgScore(int avgScore) { this.avgScore = avgScore; return this; }
            public ClassAnalyticsBuilder lowPerformers(int lowPerformers) { this.lowPerformers = lowPerformers; return this; }
            public ClassAnalyticsBuilder topPerformers(int topPerformers) { this.topPerformers = topPerformers; return this; }
            public ClassAnalytics build() { return new ClassAnalytics(totalStudents, evaluated, pending, avgScore, lowPerformers, topPerformers); }
        }
    }

    public static class LabSchedule {
        private int id;
        private String day;
        private String time;
        private String lab;
        private String batch;

        public LabSchedule() {}
        public LabSchedule(int id, String day, String time, String lab, String batch) {
            this.id = id;
            this.day = day;
            this.time = time;
            this.lab = lab;
            this.batch = batch;
        }

        public static LabScheduleBuilder builder() { return new LabScheduleBuilder(); }

        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getDay() { return day; }
        public void setDay(String day) { this.day = day; }
        public String getTime() { return time; }
        public void setTime(String time) { this.time = time; }
        public String getLab() { return lab; }
        public void setLab(String lab) { this.lab = lab; }
        public String getBatch() { return batch; }
        public void setBatch(String batch) { this.batch = batch; }

        public static class LabScheduleBuilder {
            private int id;
            private String day;
            private String time;
            private String lab;
            private String batch;

            public LabScheduleBuilder id(int id) { this.id = id; return this; }
            public LabScheduleBuilder day(String day) { this.day = day; return this; }
            public LabScheduleBuilder time(String time) { this.time = time; return this; }
            public LabScheduleBuilder lab(String lab) { this.lab = lab; return this; }
            public LabScheduleBuilder batch(String batch) { this.batch = batch; return this; }
            public LabSchedule build() { return new LabSchedule(id, day, time, lab, batch); }
        }
    }
}
