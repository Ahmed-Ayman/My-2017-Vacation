package Java.utils.service.Task;

import java.util.List;

/**
 * Created by ahmed-ayman on 8/18/17.
 */
public class ClusterTask  extends Task {
    public ClusterTask(int dataSet, String tableName) {
        super(dataSet, tableName);
    }

    @Override
    protected List<Object> runAlgorithm() {
        System.out.println("running the algorithem after getting the table name" + this.tableName);
        return null;
    }
    @Override
    protected void writeResult(List<Object> objects) {
        System.out.println("writing the results after getting into "+this.tableName);
    }
}
