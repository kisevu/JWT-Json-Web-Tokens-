package com.ameda.kevin.Auth;

import java.util.Optional;

public interface ApplicationUserDAO{
    Optional<ApplicationUser> selectApplicationUserByUsername(String username);
}
