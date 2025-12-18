
package demob4;

public class DemoStatic {
    public int nonStaticData = 10;
    public static int staticData = 20;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DemoStatic{");
        sb.append("nonStaticData=").append(nonStaticData);
        sb.append(", staticData=").append(staticData);
        sb.append('}');
        return sb.toString();
    }

    
}
