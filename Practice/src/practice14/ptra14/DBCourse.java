package practice14.ptra14;

import practice14.common.Course;

public class DBCourse implements Course{

	public String getCourseName() {
		return "【Eラーニング】DB基礎";
	}
	
	public String[] getCourseUnit() {
		String[] courseUnit = {"DB基礎","SQL基礎","正規化","SQL応用"};
			return courseUnit;
	}
}
