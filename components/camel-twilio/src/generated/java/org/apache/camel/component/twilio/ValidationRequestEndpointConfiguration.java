
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.ValidationRequest}.
 */
@ApiParams(apiName = "validation-request", 
           description = "",
           apiMethods = {@ApiMethod(methodName = "creator", description="Create a ValidationRequestCreator to execute create", signatures={"com.twilio.rest.api.v2010.account.ValidationRequestCreator creator(com.twilio.type.PhoneNumber phoneNumber)", "com.twilio.rest.api.v2010.account.ValidationRequestCreator creator(String pathAccountSid, com.twilio.type.PhoneNumber phoneNumber)"}), }, aliases = {"^creator$=create", "^deleter$=delete", "^fetcher$=fetch", "^reader$=read", "^updater$=update"})
@UriParams
@Configurer
public final class ValidationRequestEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The SID of the Account responsible for the new Caller ID")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The phone number to verify in E.164 format"), @ApiMethod(methodName = "creator", description="The phone number to verify in E.164 format")})
    private com.twilio.type.PhoneNumber phoneNumber;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public com.twilio.type.PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(com.twilio.type.PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
