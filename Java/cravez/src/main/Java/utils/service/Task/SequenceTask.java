package Java.utils.service.Task;

import java.util.List;

/**
 * Created by ahmed-ayman on 8/18/17.
 */
public class SequenceTask extends Task {
    public SequenceTask(int dataSet, String tableName) {
        super(dataSet, tableName);
    }

    @Override
    protected List<Object> runAlgorithm() {
        return null;
    }

    @Override
    protected void writeResult(List<Object> objects) {

    }
}
