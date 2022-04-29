package eu.interopehrate.hri.thri;

public class Citizen {

    private String citizenId;
    private String citizenUsername;
    private String cloudUri;

    public Citizen() {

    }

    public String getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(String citizenId) {
        this.citizenId = citizenId;
    }

    public String getCitizenUsername() {
        return citizenUsername;
    }

    public void setCitizenUsername(String citizenUsername) {
        this.citizenUsername = citizenUsername;
    }

    public String getCloudUri() {
        return cloudUri;
    }

    public void setCloudUri(String cloudUri) {
        this.cloudUri = cloudUri;
    }
}
