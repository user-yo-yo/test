package afdfsffa;

public class Student {
	public int id;
    public static int classNo;
    // クラス変数には「static」を付ける

    public void setStatus(int id, int classNo) {
        this.id = id;
        this.classNo = classNo;
    }

    public int getID() {
        return this.id;
    }

    public int getClassNo() {
        return classNo;
    }
}