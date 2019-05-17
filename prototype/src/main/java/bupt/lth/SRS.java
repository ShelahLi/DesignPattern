//软件需求规格说明书类（Software Requirements Specification）
public  class SRS implements OfficialDocument, Cloneable{

    public OfficialDocument clone() {
        OfficialDocument srs = null;
        try {
            srs = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return srs;
    }

    public void display() {
        System.out.println("《软件需求规格说明书》");
    }
}