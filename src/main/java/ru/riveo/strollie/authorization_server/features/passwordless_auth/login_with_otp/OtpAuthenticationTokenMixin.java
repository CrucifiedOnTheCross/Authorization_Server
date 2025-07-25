package ru.riveo.strollie.authorization_server.features.passwordless_auth.login_with_otp;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonIgnoreProperties(ignoreUnknown = true, value = { "authenticated" })
public abstract class OtpAuthenticationTokenMixin {

    @JsonCreator
    public OtpAuthenticationTokenMixin(
            @JsonProperty("email") String email,
            @JsonProperty("otp") String otp,
            @JsonProperty("authorities") Collection<? extends GrantedAuthority> authorities) {
    }
}
