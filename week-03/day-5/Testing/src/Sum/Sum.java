package Sum;

import java.util.ArrayList;
import java.util.List;

public class Sum {
    private List<Integer> nums;

    public Sum() {
        nums = new ArrayList<Integer>();
    }

    public List<Integer> getNums() {
        return this.nums;
    }

    public void setNums(Integer num) {
        this.nums.add(num);
    }

    public int sum() {

        if (this.getNums().contains(null)) {
            return 0;
        } else if (this.getNums().size() > 0) {
            int sum = 0;
            for (int i = 0; i < this.getNums().size(); i++) {
                sum += this.getNums().get(i);
            }
            return sum;
        }
        return 0;
    }
}
