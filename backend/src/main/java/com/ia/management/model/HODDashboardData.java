package com.ia.management.model;

import java.util.List;

public class HODDashboardData {
    private HODProfile profile;
    private DepartmentStats stats;
    private BranchComparison branchComparison;
    private List<ResourceRequest> resourceRequests;
    private List<DepartmentAlert> alerts;
    private List<FacultyStatus> facultyRoster;

    public HODDashboardData() {}

    public HODDashboardData(HODProfile profile, DepartmentStats stats, BranchComparison branchComparison, List<ResourceRequest> resourceRequests, List<DepartmentAlert> alerts, List<FacultyStatus> facultyRoster) {
        this.profile = profile;
        this.stats = stats;
        this.branchComparison = branchComparison;
        this.resourceRequests = resourceRequests;
        this.alerts = alerts;
        this.facultyRoster = facultyRoster;
    }

    public static HODDashboardDataBuilder builder() { return new HODDashboardDataBuilder(); }

    public HODProfile getProfile() { return profile; }
    public void setProfile(HODProfile profile) { this.profile = profile; }
    public DepartmentStats getStats() { return stats; }
    public void setStats(DepartmentStats stats) { this.stats = stats; }
    public BranchComparison getBranchComparison() { return branchComparison; }
    public void setBranchComparison(BranchComparison branchComparison) { this.branchComparison = branchComparison; }
    public List<ResourceRequest> getResourceRequests() { return resourceRequests; }
    public void setResourceRequests(List<ResourceRequest> resourceRequests) { this.resourceRequests = resourceRequests; }
    public List<DepartmentAlert> getAlerts() { return alerts; }
    public void setAlerts(List<DepartmentAlert> alerts) { this.alerts = alerts; }
    public List<FacultyStatus> getFacultyRoster() { return facultyRoster; }
    public void setFacultyRoster(List<FacultyStatus> facultyRoster) { this.facultyRoster = facultyRoster; }

    public static class HODDashboardDataBuilder {
        private HODProfile profile;
        private DepartmentStats stats;
        private BranchComparison branchComparison;
        private List<ResourceRequest> resourceRequests;
        private List<DepartmentAlert> alerts;
        private List<FacultyStatus> facultyRoster;

        public HODDashboardDataBuilder profile(HODProfile profile) { this.profile = profile; return this; }
        public HODDashboardDataBuilder stats(DepartmentStats stats) { this.stats = stats; return this; }
        public HODDashboardDataBuilder branchComparison(BranchComparison branchComparison) { this.branchComparison = branchComparison; return this; }
        public HODDashboardDataBuilder resourceRequests(List<ResourceRequest> resourceRequests) { this.resourceRequests = resourceRequests; return this; }
        public HODDashboardDataBuilder alerts(List<DepartmentAlert> alerts) { this.alerts = alerts; return this; }
        public HODDashboardDataBuilder facultyRoster(List<FacultyStatus> facultyRoster) { this.facultyRoster = facultyRoster; return this; }
        public HODDashboardData build() { return new HODDashboardData(profile, stats, branchComparison, resourceRequests, alerts, facultyRoster); }
    }

    public static class HODProfile {
        private String name;
        private String department;

        public HODProfile() {}
        public HODProfile(String name, String department) { this.name = name; this.department = department; }
        public static HODProfileBuilder builder() { return new HODProfileBuilder(); }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getDepartment() { return department; }
        public void setDepartment(String department) { this.department = department; }

        public static class HODProfileBuilder {
            private String name;
            private String department;
            public HODProfileBuilder name(String name) { this.name = name; return this; }
            public HODProfileBuilder department(String department) { this.department = department; return this; }
            public HODProfile build() { return new HODProfile(name, department); }
        }
    }

    public static class DepartmentStats {
        private int totalStudents;
        private int facultyCount;
        private int passPercentage;
        private int pendingIssues;

        public DepartmentStats() {}
        public DepartmentStats(int totalStudents, int facultyCount, int passPercentage, int pendingIssues) {
            this.totalStudents = totalStudents;
            this.facultyCount = facultyCount;
            this.passPercentage = passPercentage;
            this.pendingIssues = pendingIssues;
        }
        public static DepartmentStatsBuilder builder() { return new DepartmentStatsBuilder(); }
        public int getTotalStudents() { return totalStudents; }
        public void setTotalStudents(int totalStudents) { this.totalStudents = totalStudents; }
        public int getFacultyCount() { return facultyCount; }
        public void setFacultyCount(int facultyCount) { this.facultyCount = facultyCount; }
        public int getPassPercentage() { return passPercentage; }
        public void setPassPercentage(int passPercentage) { this.passPercentage = passPercentage; }
        public int getPendingIssues() { return pendingIssues; }
        public void setPendingIssues(int pendingIssues) { this.pendingIssues = pendingIssues; }

        public static class DepartmentStatsBuilder {
            private int totalStudents;
            private int facultyCount;
            private int passPercentage;
            private int pendingIssues;
            public DepartmentStatsBuilder totalStudents(int totalStudents) { this.totalStudents = totalStudents; return this; }
            public DepartmentStatsBuilder facultyCount(int facultyCount) { this.facultyCount = facultyCount; return this; }
            public DepartmentStatsBuilder passPercentage(int passPercentage) { this.passPercentage = passPercentage; return this; }
            public DepartmentStatsBuilder pendingIssues(int pendingIssues) { this.pendingIssues = pendingIssues; return this; }
            public DepartmentStats build() { return new DepartmentStats(totalStudents, facultyCount, passPercentage, pendingIssues); }
        }
    }

    public static class BranchComparison {
        private List<String> labels;
        private List<Integer> passPercentage;
        private List<Integer> attendance;

        public BranchComparison() {}
        public BranchComparison(List<String> labels, List<Integer> passPercentage, List<Integer> attendance) {
            this.labels = labels;
            this.passPercentage = passPercentage;
            this.attendance = attendance;
        }
        public static BranchComparisonBuilder builder() { return new BranchComparisonBuilder(); }
        public List<String> getLabels() { return labels; }
        public void setLabels(List<String> labels) { this.labels = labels; }
        public List<Integer> getPassPercentage() { return passPercentage; }
        public void setPassPercentage(List<Integer> passPercentage) { this.passPercentage = passPercentage; }
        public List<Integer> getAttendance() { return attendance; }
        public void setAttendance(List<Integer> attendance) { this.attendance = attendance; }

        public static class BranchComparisonBuilder {
            private List<String> labels;
            private List<Integer> passPercentage;
            private List<Integer> attendance;
            public BranchComparisonBuilder labels(List<String> labels) { this.labels = labels; return this; }
            public BranchComparisonBuilder passPercentage(List<Integer> passPercentage) { this.passPercentage = passPercentage; return this; }
            public BranchComparisonBuilder attendance(List<Integer> attendance) { this.attendance = attendance; return this; }
            public BranchComparison build() { return new BranchComparison(labels, passPercentage, attendance); }
        }
    }

    public static class ResourceRequest {
        private int id;
        private String request;
        private String requester;
        private String status;

        public ResourceRequest() {}
        public ResourceRequest(int id, String request, String requester, String status) {
            this.id = id;
            this.request = request;
            this.requester = requester;
            this.status = status;
        }
        public static ResourceRequestBuilder builder() { return new ResourceRequestBuilder(); }
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getRequest() { return request; }
        public void setRequest(String request) { this.request = request; }
        public String getRequester() { return requester; }
        public void setRequester(String requester) { this.requester = requester; }
        public String getStatus() { return status; }
        public void setStatus(String status) { this.status = status; }

        public static class ResourceRequestBuilder {
            private int id;
            private String request;
            private String requester;
            private String status;
            public ResourceRequestBuilder id(int id) { this.id = id; return this; }
            public ResourceRequestBuilder request(String request) { this.request = request; return this; }
            public ResourceRequestBuilder requester(String requester) { this.requester = requester; return this; }
            public ResourceRequestBuilder status(String status) { this.status = status; return this; }
            public ResourceRequest build() { return new ResourceRequest(id, request, requester, status); }
        }
    }

    public static class DepartmentAlert {
        private int id;
        private String message;
        private String date;
        private String type;

        public DepartmentAlert() {}
        public DepartmentAlert(int id, String message, String date, String type) {
            this.id = id;
            this.message = message;
            this.date = date;
            this.type = type;
        }
        public static DepartmentAlertBuilder builder() { return new DepartmentAlertBuilder(); }
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getMessage() { return message; }
        public void setMessage(String message) { this.message = message; }
        public String getDate() { return date; }
        public void setDate(String date) { this.date = date; }
        public String getType() { return type; }
        public void setType(String type) { this.type = type; }

        public static class DepartmentAlertBuilder {
            private int id;
            private String message;
            private String date;
            private String type;
            public DepartmentAlertBuilder id(int id) { this.id = id; return this; }
            public DepartmentAlertBuilder message(String message) { this.message = message; return this; }
            public DepartmentAlertBuilder date(String date) { this.date = date; return this; }
            public DepartmentAlertBuilder type(String type) { this.type = type; return this; }
            public DepartmentAlert build() { return new DepartmentAlert(id, message, date, type); }
        }
    }

    public static class FacultyStatus {
        private String name;
        private String status;
        private String initials;

        public FacultyStatus() {}
        public FacultyStatus(String name, String status, String initials) {
            this.name = name;
            this.status = status;
            this.initials = initials;
        }
        public static FacultyStatusBuilder builder() { return new FacultyStatusBuilder(); }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getStatus() { return status; }
        public void setStatus(String status) { this.status = status; }
        public String getInitials() { return initials; }
        public void setInitials(String initials) { this.initials = initials; }

        public static class FacultyStatusBuilder {
            private String name;
            private String status;
            private String initials;
            public FacultyStatusBuilder name(String name) { this.name = name; return this; }
            public FacultyStatusBuilder status(String status) { this.status = status; return this; }
            public FacultyStatusBuilder initials(String initials) { this.initials = initials; return this; }
            public FacultyStatus build() { return new FacultyStatus(name, status, initials); }
        }
    }
}
