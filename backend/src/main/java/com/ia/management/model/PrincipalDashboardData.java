package com.ia.management.model;

import java.util.List;

public class PrincipalDashboardData {
    private InstituteStats stats;
    private List<String> branches;
    private List<Integer> passFailData;
    private List<Double> branchPerformance;
    private List<BroadcastMessage> broadcasts;
    private List<ScheduleItem> schedule;

    public PrincipalDashboardData() {}

    public PrincipalDashboardData(InstituteStats stats, List<String> branches, List<Integer> passFailData, List<Double> branchPerformance, List<BroadcastMessage> broadcasts, List<ScheduleItem> schedule) {
        this.stats = stats;
        this.branches = branches;
        this.passFailData = passFailData;
        this.branchPerformance = branchPerformance;
        this.broadcasts = broadcasts;
        this.schedule = schedule;
    }

    public static PrincipalDashboardDataBuilder builder() { return new PrincipalDashboardDataBuilder(); }

    public InstituteStats getStats() { return stats; }
    public void setStats(InstituteStats stats) { this.stats = stats; }
    public List<String> getBranches() { return branches; }
    public void setBranches(List<String> branches) { this.branches = branches; }
    public List<Integer> getPassFailData() { return passFailData; }
    public void setPassFailData(List<Integer> passFailData) { this.passFailData = passFailData; }
    public List<Double> getBranchPerformance() { return branchPerformance; }
    public void setBranchPerformance(List<Double> branchPerformance) { this.branchPerformance = branchPerformance; }
    public List<BroadcastMessage> getBroadcasts() { return broadcasts; }
    public void setBroadcasts(List<BroadcastMessage> broadcasts) { this.broadcasts = broadcasts; }
    public List<ScheduleItem> getSchedule() { return schedule; }
    public void setSchedule(List<ScheduleItem> schedule) { this.schedule = schedule; }

    public static class PrincipalDashboardDataBuilder {
        private InstituteStats stats;
        private List<String> branches;
        private List<Integer> passFailData;
        private List<Double> branchPerformance;
        private List<BroadcastMessage> broadcasts;
        private List<ScheduleItem> schedule;

        public PrincipalDashboardDataBuilder stats(InstituteStats stats) { this.stats = stats; return this; }
        public PrincipalDashboardDataBuilder branches(List<String> branches) { this.branches = branches; return this; }
        public PrincipalDashboardDataBuilder passFailData(List<Integer> passFailData) { this.passFailData = passFailData; return this; }
        public PrincipalDashboardDataBuilder branchPerformance(List<Double> branchPerformance) { this.branchPerformance = branchPerformance; return this; }
        public PrincipalDashboardDataBuilder broadcasts(List<BroadcastMessage> broadcasts) { this.broadcasts = broadcasts; return this; }
        public PrincipalDashboardDataBuilder schedule(List<ScheduleItem> schedule) { this.schedule = schedule; return this; }
        public PrincipalDashboardData build() { return new PrincipalDashboardData(stats, branches, passFailData, branchPerformance, broadcasts, schedule); }
    }

    public static class InstituteStats {
        private int totalStudents;
        private int placementRate;
        private String feeCollection;
        private int avgAttendance;

        public InstituteStats() {}
        public InstituteStats(int totalStudents, int placementRate, String feeCollection, int avgAttendance) {
            this.totalStudents = totalStudents;
            this.placementRate = placementRate;
            this.feeCollection = feeCollection;
            this.avgAttendance = avgAttendance;
        }
        public static InstituteStatsBuilder builder() { return new InstituteStatsBuilder(); }
        public int getTotalStudents() { return totalStudents; }
        public void setTotalStudents(int totalStudents) { this.totalStudents = totalStudents; }
        public int getPlacementRate() { return placementRate; }
        public void setPlacementRate(int placementRate) { this.placementRate = placementRate; }
        public String getFeeCollection() { return feeCollection; }
        public void setFeeCollection(String feeCollection) { this.feeCollection = feeCollection; }
        public int getAvgAttendance() { return avgAttendance; }
        public void setAvgAttendance(int avgAttendance) { this.avgAttendance = avgAttendance; }

        public static class InstituteStatsBuilder {
            private int totalStudents;
            private int placementRate;
            private String feeCollection;
            private int avgAttendance;
            public InstituteStatsBuilder totalStudents(int totalStudents) { this.totalStudents = totalStudents; return this; }
            public InstituteStatsBuilder placementRate(int placementRate) { this.placementRate = placementRate; return this; }
            public InstituteStatsBuilder feeCollection(String feeCollection) { this.feeCollection = feeCollection; return this; }
            public InstituteStatsBuilder avgAttendance(int avgAttendance) { this.avgAttendance = avgAttendance; return this; }
            public InstituteStats build() { return new InstituteStats(totalStudents, placementRate, feeCollection, avgAttendance); }
        }
    }

    public static class BroadcastMessage {
        private int id;
        private String message;
        private String target;
        private String date;

        public BroadcastMessage() {}
        public BroadcastMessage(int id, String message, String target, String date) {
            this.id = id; this.message = message; this.target = target; this.date = date;
        }
        public static BroadcastMessageBuilder builder() { return new BroadcastMessageBuilder(); }
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getMessage() { return message; }
        public void setMessage(String message) { this.message = message; }
        public String getTarget() { return target; }
        public void setTarget(String target) { this.target = target; }
        public String getDate() { return date; }
        public void setDate(String date) { this.date = date; }

        public static class BroadcastMessageBuilder {
            private int id;
            private String message;
            private String target;
            private String date;
            public BroadcastMessageBuilder id(int id) { this.id = id; return this; }
            public BroadcastMessageBuilder message(String message) { this.message = message; return this; }
            public BroadcastMessageBuilder target(String target) { this.target = target; return this; }
            public BroadcastMessageBuilder date(String date) { this.date = date; return this; }
            public BroadcastMessage build() { return new BroadcastMessage(id, message, target, date); }
        }
    }

    public static class ScheduleItem {
        private int id;
        private String time;
        private String title;
        private String type;

        public ScheduleItem() {}
        public ScheduleItem(int id, String time, String title, String type) {
            this.id = id; this.time = time; this.title = title; this.type = type;
        }
        public static ScheduleItemBuilder builder() { return new ScheduleItemBuilder(); }
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getTime() { return time; }
        public void setTime(String time) { this.time = time; }
        public String getTitle() { return title; }
        public void setTitle(String title) { this.title = title; }
        public String getType() { return type; }
        public void setType(String type) { this.type = type; }

        public static class ScheduleItemBuilder {
            private int id;
            private String time;
            private String title;
            private String type;
            public ScheduleItemBuilder id(int id) { this.id = id; return this; }
            public ScheduleItemBuilder time(String time) { this.time = time; return this; }
            public ScheduleItemBuilder title(String title) { this.title = title; return this; }
            public ScheduleItemBuilder type(String type) { this.type = type; return this; }
            public ScheduleItem build() { return new ScheduleItem(id, time, title, type); }
        }
    }
}
