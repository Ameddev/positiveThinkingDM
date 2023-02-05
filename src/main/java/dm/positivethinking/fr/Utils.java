package dm.positivethinking.fr;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static ArrayList partition(@NotNull List list, int length){
        if(length <= 0){
            throw new NegativeArraySizeException("ERR_NS_2028");
        }
        ArrayList result = new ArrayList();
        if (length >= list.size()) {
            result.add(list);
            return result;
        }
        result.add(list.subList(0, length));
        result.addAll(partition(list.subList(length, list.size()), length));

        return result;
    }
}
