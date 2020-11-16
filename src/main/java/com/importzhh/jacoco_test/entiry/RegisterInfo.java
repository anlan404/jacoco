package com.importzhh.jacoco_test.entiry;


public class RegisterInfo {
    
    private String host = "localhost";

    
    private Integer port = 6300;

    
    private String applicationName;

    
    private String gitRepositoryUrl;

    private String oldBranch = "master";

    private String oldBranchCommitId;

    private String newBranch = "pre";

    private String newBranchCommitId;

    private Integer runTimes = 0;

    private Long lastRunTime = 0L;

    private Integer failTimes = 0;

    private String gitDir;


    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getGitRepositoryUrl() {
        return gitRepositoryUrl;
    }

    public void setGitRepositoryUrl(String gitRepositoryUrl) {
        this.gitRepositoryUrl = gitRepositoryUrl;
    }

    public String getOldBranch() {
        return oldBranch;
    }

    public void setOldBranch(String oldBranch) {
        this.oldBranch = oldBranch;
    }

    public String getOldBranchCommitId() {
        return oldBranchCommitId;
    }

    public void setOldBranchCommitId(String oldBranchCommitId) {
        this.oldBranchCommitId = oldBranchCommitId;
    }

    public String getNewBranch() {
        return newBranch;
    }

    public void setNewBranch(String newBranch) {
        this.newBranch = newBranch;
    }

    public String getNewBranchCommitId() {
        return newBranchCommitId;
    }

    public void setNewBranchCommitId(String newBranchCommitId) {
        this.newBranchCommitId = newBranchCommitId;
    }

    public Integer getRunTimes() {
        return runTimes;
    }

    public void setRunTimes(Integer runTimes) {
        this.runTimes = runTimes;
    }

    public Long getLastRunTime() {
        return lastRunTime;
    }

    public void setLastRunTime(Long lastRunTime) {
        this.lastRunTime = lastRunTime;
    }

    public Integer getFailTimes() {
        return failTimes;
    }

    public void setFailTimes(Integer failTimes) {
        this.failTimes = failTimes;
    }

    public String getGitDir() {
        return gitDir;
    }

    public void setGitDir(String gitDir) {
        this.gitDir = gitDir;
    }
}
