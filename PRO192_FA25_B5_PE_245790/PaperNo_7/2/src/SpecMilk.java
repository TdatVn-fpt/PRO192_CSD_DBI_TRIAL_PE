public class SpecMilk extends Milk {
    private String taste;

    public SpecMilk() {
    }

    public SpecMilk(String name, int load, String taste) {
        super(name, load);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    @Override
    public String toString() {
        return getName() + ", " + taste + ", " + getLoad();
    }

    public void setData() {
        String name = getName();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (!Character.isLowerCase(c)) {
                result.append(c);
            }
        }
        setName(result.toString());
    }

    
    public String getValue() {
        if (getName().length() > taste.length()) {
            return getName() + taste;
        } else {
            return getName() + getLoad();
        }
    }
}
