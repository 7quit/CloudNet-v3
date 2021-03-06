package de.dytanic.cloudnet.ext.cloudflare;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Collection;

@ToString
@EqualsAndHashCode
public class CloudflareConfigurationEntry {

    protected boolean enabled;

    protected String hostAddress, email, apiToken, zoneId, domainName;

    protected Collection<CloudflareGroupConfiguration> groups;

    public CloudflareConfigurationEntry(boolean enabled, String hostAddress, String email, String apiToken, String zoneId, String domainName, Collection<CloudflareGroupConfiguration> groups) {
        this.enabled = enabled;
        this.hostAddress = hostAddress;
        this.email = email;
        this.apiToken = apiToken;
        this.zoneId = zoneId;
        this.domainName = domainName;
        this.groups = groups;
    }

    public CloudflareConfigurationEntry() {
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getHostAddress() {
        return this.hostAddress;
    }

    public void setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApiToken() {
        return this.apiToken;
    }

    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }

    public String getZoneId() {
        return this.zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getDomainName() {
        return this.domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public Collection<CloudflareGroupConfiguration> getGroups() {
        return this.groups;
    }

    public void setGroups(Collection<CloudflareGroupConfiguration> groups) {
        this.groups = groups;
    }

}