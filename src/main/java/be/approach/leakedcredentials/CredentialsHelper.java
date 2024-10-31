package be.approach.leakedcredentials;

import javax.naming.Context;
import java.util.Properties;

public class CredentialsHelper {
    private String var1 = "AKIEHI385HKH1IWUQEEN"; // aws id
    private String var2 = "PA3XsxZ8d8cPQLmnZzVhaRdzC6ND2a8vhbyXU/Dw"; // aws key

    private String api_key = "912ec803b2ce49e4a541068d495ab570"; // api key
    private String password = "UzKOil9ijxObd3X97e4MpAqWwUXSF3AfbALcvIfFVWk"; // password
    private String var3 = "-----BEGIN RSA PRIVATE KEY-----\nQyNTUxOQAAACCtrF27B/zd9DEpd38IbVBy93wSeYXKU0AGXMyO8ePu2QAAAKBSzpYEUs6W\n-----END RSA PRIVATE KEY-----"; // private key


    public String getUsername() {
        return "username";
    }

    public String getPassword() {
        return password;
    }

    public Properties doStuff() {
        Properties props = new Properties();
        props.put(Context.SECURITY_PRINCIPAL, "p@dzdzadzadzadzassw0rd");
        props.put(Context.SECURITY_CREDENTIALS, "p@dzdzadzadzadzassw0rd");
        return props;
    }

}
