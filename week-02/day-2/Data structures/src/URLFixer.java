public class URLFixer {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";
        String workingUrl = url.replace("bots", "odds");
        url = workingUrl;
        int doubleDot = url.indexOf("/");
        url = url.substring(0, doubleDot) + ":" + url.substring(doubleDot);
        System.out.println(url);
    }
}
