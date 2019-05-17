//可行性分析报告类（Feasibility Analysis Report）
public  class FAR implements OfficialDocument, Cloneable {

    public OfficialDocument clone() {
       OfficialDocument far = null;
        try {
            far = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return far;
    }

    public void display() {
        System.out.println("《可行性分析报告》");
    }
}
