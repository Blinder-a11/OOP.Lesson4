package group.shoshkin.lesson04;

import java.util.List;

public interface UserView<T extends User> {
	public void sendOnConsole(List<T> list);
}
