package integrations.turnitin.com.membersearcher.model;

import java.util.List;

public record MembershipList(List<Membership> memberships) {

    public List<Membership> memberships() {
        if (memberships != null)
            return List.copyOf(memberships);
        return List.of();
    }
}
