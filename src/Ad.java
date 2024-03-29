import java.util.ArrayList;

public class Ad extends BaseAdvertising{
    public static ArrayList<Ad> list = new ArrayList<>();
    private String title;
    private String imgUrl;
    private String link;
    private Advertiser advertiser;

    public Ad(int id, String title, String imgUrl, String link, Advertiser advertiser) throws Exception {
        super(id);
        for(Ad ad : list) {
            if(ad.getId() == id) {
                throw new Exception("There is an ad with this id!");
            }
        }
        this.title = title;
        this.imgUrl = imgUrl;
        this.link = link;
        this.advertiser = advertiser;
        list.add(this);
        advertiser.addAd(this);
    }

    public static String describeMe() {
        return "Something";
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getImgUrl() {
        return this.imgUrl;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public String getLink() {
        return this.link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public void setAdvertiser(Advertiser advertiser) {
        this.advertiser = advertiser;
    }
}
