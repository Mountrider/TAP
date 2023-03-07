package Lab3;

import java.util.Date;
import java.util.Stack;

public class TimestampedStack<E> extends Stack<E> {
    private Date lastAccessTime;

    @Override
    public E push(E item) {
        lastAccessTime = new Date();
        return super.push(item);
    }

    @Override
    public synchronized E pop() {
        lastAccessTime = new Date();
        return super.pop();
    }

    public long getDaysSinceLastAccess() {
        Date now = new Date();
        long diff = now.getTime() - lastAccessTime.getTime();
        return diff / (24 * 60 * 60 * 1000);
    }
}
