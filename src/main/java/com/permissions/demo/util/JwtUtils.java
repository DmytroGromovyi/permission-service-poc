package com.permissions.demo.util;

import com.auth0.jwt.interfaces.DecodedJWT;
import lombok.experimental.UtilityClass;

@UtilityClass
public class JwtUtils {

    public static String getClaimsUserId(DecodedJWT jwt) {
        return getClaimAttribute(jwt, "user_id");
    }

    private static String getClaimAttribute(DecodedJWT jwt, String attribute) {
        return jwt.getClaim(attribute).asString();
    }
}
