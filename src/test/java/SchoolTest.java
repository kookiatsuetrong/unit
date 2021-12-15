import java.util.List;
import java.util.ArrayList;

public class SchoolTest {
	public void test001() {
		List<Integer> u = new ArrayList<>();
		u.add(1); u.add(2);
		List<Integer> v = new ArrayList<>();
		v.add(1); v.add(1);
		List<Integer> w = new ArrayList<>();
		w.add(3); w.add(4);
		List<List<Integer>> all = new ArrayList<>();
		all.add(u); all.add(v); all.add(w);
		School s = new School();
		int result = s.hire(all, 50);
		assert result == 0;
	}
	public void test002() {
		List<Integer> u = new ArrayList<>();
		u.add(1); u.add(2);
		List<Integer> v = new ArrayList<>();
		v.add(1); v.add(1);
		List<Integer> w = new ArrayList<>();
		w.add(3); w.add(4);
		List<List<Integer>> all = new ArrayList<>();
		all.add(u); all.add(v); all.add(w);
		School s = new School();
		int result = s.hire(all, 75);
		assert result == 2;
	}
	public void test003() {
		List<Integer> u = new ArrayList<>();
		u.add(0); u.add(10000000);
		List<List<Integer>> all = new ArrayList<>();
		all.add(u);
		School s = new School();
		int result = s.hire(all, 99);
		assert result == 990000000;
	}
	public void test004() {
		List<Integer> u = new ArrayList<>();
		u.add(0); u.add(10000000);
		List<List<Integer>> all = new ArrayList<>();
		all.add(u); all.add(u);
		School s = new School();
		int result = s.hire(all, 99);
		assert result == 1980000000;
	}
	public void test005() {
		List<Integer> u = new ArrayList<>();
		u.add(0); u.add(1000000000);
		List<List<Integer>> all = new ArrayList<>();
		all.add(u);
		School s = new School();
		int result = s.hire(all, 50);
		assert result == 1000000000;
	}
	public void test006() {
		List<Integer> u = new ArrayList<>();
		u.add(0); u.add(1000000000);
		List<List<Integer>> all = new ArrayList<>();
		all.add(u);
		all.add(u);
		School s = new School();
		int result = s.hire(all, 50);
		assert result == 2000000000;
	}
}