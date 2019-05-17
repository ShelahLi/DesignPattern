public class Client_proxy {

    public static void main(String[] args) {
        Search search;
        search = (Search)XMLUtils_proxy.getBean();
        System.out.println(search.DoSearch("lth", "lth"));

    }
}
