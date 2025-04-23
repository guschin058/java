public class four_task {
    static class NetworkInfo {
        String ssid;
        String passwd;
        String securityType;

        void showParameters() {
            System.out.println("ssid - " + ssid);
            System.out.println("passwd - " + passwd);
            System.out.println("securityType - " 
                                + securityType);
        }
    }
    static NetworkInfo createInfo(String ssid, String passwd,
                                  String securityType) {
        NetworkInfo info = new NetworkInfo();
        info.ssid = ssid;
        info.passwd = passwd;
        info.securityType = securityType;
        return info;
    }
    public static void main(String[] args) { 
        NetworkInfo netinfo = createInfo("chto", "123", "mp3");
        netinfo.showParameters();
    }
}