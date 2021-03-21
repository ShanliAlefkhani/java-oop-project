public class Main {
    public static void main(String[] args) {
        Advertiser advertiser1 = new Advertiser(1, "name1");
        Advertiser advertiser2 = new Advertiser(2, "name2");
        Ad ad1 = new Ad(1, "title1", "img-url1", "link1", advertiser1);
        Ad ad2 = new Ad(2, "title2", "img-url2", "link2", advertiser2);
        BaseAdvertising.describeMe();
        ad2.describeMe();
        advertiser1.describeMe();
        ad1.incViews();
        ad1.incViews();
        ad1.incViews();
        ad1.incViews();
        ad2.incViews();
        ad1.incClicks();
        ad1.incClicks();
        ad2.incClicks();
        advertiser2.getName();
        advertiser2.setName("new name");
        advertiser2.getName();
        ad1.getClicks();
        advertiser2.getClicks();
        Advertiser.getTotalClicks();
        Advertiser.help();
    }
}
