import java.util.*;

// class Assignment4{

// 	public static void main(String[] args) {
		
// 		int [] arr = {1,2,3,4};
// 		int ele = 5;
// 		int idx = 2;

// 		System.out.println(Arrays.toString(arr));

// 		int [] newArr = checkIndex(arr, ele, idx);

// 		if (arr.length!=newArr.length) {
// 			System.out.println(Arrays.toString(newArr));
// 		}
// 		else{
// 			System.out.println("index "+idx+" is not present in this "+Arrays.toString(newArr));
// 		}
// 	}

// 	public static int[] checkIndex(int[] arr, int ele, int idx){

// 		int i=0;
// 		while(i<arr.length){

// 			if (i==idx) {
// 				return insertElement(arr, ele, idx);
// 			}
// 			i++;
// 		}
// 		return arr;
// 	}

// 	public static int[] insertElement(int [] arr, int ele, int idx){

// 		int [] newArr = new int[arr.length+1];
// 		int i=0;
// 		while(i<newArr.length){

// 			if (i>idx) {
// 				newArr[idx] = ele;
// 				newArr[i] = arr[i-1];
// 			}
// 			else{
// 				newArr[i] = arr[i];
// 			}
// 				i++;
// 		}
// 		return newArr;
// 	}
// }

// 2) Remove an element from given range

class Assignment4{

	public static void main(String[] args) {
		
		int [] arr = {10, 9, 5, 4, 1, 2};

		int sIdx = 1;
		int eIdx = 3;

		if (sIdx>0 && eIdx<arr.length) {
			int [] ans = removeRange(arr, sIdx, eIdx);
			
			System.out.println(Arrays.toString(ans));
		}
		else{
			System.out.println("Invalid Indexes");
		}
	}

	public static int[] removeRange(int[] arr, int sIdx, int eIdx){

		int[] newArr = new int[arr.length-(eIdx-sIdx+1)];

		for (int i=0, j=0; i<arr.length ; i++) {
			if (i>=sIdx && i<=eIdx) {
				continue;
			}
			else{
				newArr[j++] = arr[i];
			}

		}
		return newArr;
	}
}


// 3) remove student by there name

// import java.util.*;
// class Student{

// 	String name ;
// 	int id ;
// 	int age;
// 	String coll;
// 	double per;

// 	Student(){

// 	}

// 	Student(String name, int id, int age, String coll, double per){

// 		this.name = name;
// 		this.id = id;
// 		this.age = age;
// 		this.coll = coll;
// 		this.per = per;
// 	}

// 	public void displayStudent(){

// 		System.out.println("Name: "+name);
// 		System.out.println("ID: "+id);
// 		System.out.println("Age: "+age);
// 		System.out.println("College: "+coll);
// 		System.out.println("Percentage: "+per);
// 	}
// }

// class NewStudentDriver{

// 	public static void main(String[] args) {
		
// 		Student [] st = new Student[4];

// 		st[0] = new Student("Sudarshan", 4, 21, "SP college", 54);
// 		st[1] = new Student("Ram", 3, 22, "SP college", 67);
// 		st[2] = new Student("Shubham", 5, 24, "SP college", 45.5);
// 		st[3] = new Student("Ramesh", 1, 22, "SP college", 94.30);

// 		for (int i=0; i<st.length ; i++) {
// 			st[i].displayStudent();
// 			System.out.println("-----------------------");
// 		}

// 		removeStudent(st, "Ram");
// 	}

// 	public static void removeStudent(Student [] st, String name){

// 		int nameLength=0;
// 		for (int i=0; i<st.length ; i++) {
			
// 			if (st[i].name.equals(name)) {
// 				nameLength++;
// 			}
// 		}
// 		Student [] ans = new Student[st.length-nameLength];
// 		for (int i=0, j=0; i<st.length ; i++) {
			
// 			if (!st[i].name.equals(name)) {
// 				ans[j++] = st[i];
// 			}
			
// 		}
// 		System.out.println("-----------------------");
// 		System.out.println("Remaining Student");
// 		System.out.println("-----------------------");
// 		for (int i=0; i<ans.length ; i++) {
// 			ans[i].displayStudent();
// 			System.out.println("-----------------------");
// 		}

// 	}
// }

// 4) remove student by there ID

// import java.util.*;

// class Student{

// 	String name ;
// 	int id ;
// 	int age;
// 	String coll;
// 	double per;

// 	Student(){

// 	}

// 	Student(String name, int id, int age, String coll, double per){

// 		this.name = name;
// 		this.id = id;
// 		this.age = age;
// 		this.coll = coll;
// 		this.per = per;
// 	}

// 	public void displayStudent(){

// 		System.out.println("Name: "+name);
// 		System.out.println("ID: "+id);
// 		System.out.println("Age: "+age);
// 		System.out.println("College: "+coll);
// 		System.out.println("Percentage: "+per);
// 	}
// }
// class RemoveStudentDriver{

// 	public static void main(String[] args) {
		
// 		Student [] st = new Student[4];

// 		st[0] = new Student("Sudarshan", 4, 21, "SP college", 54);
// 		st[1] = new Student("Ram", 3, 22, "SP college", 67);
// 		st[2] = new Student("Shubham", 5, 24, "SP college", 45.5);
// 		st[3] = new Student("Ramesh", 1, 22, "SP college", 94.30);

// 		for (int i=0; i<st.length ; i++) {
// 			st[i].displayStudent();
// 			System.out.println("-----------------------");
// 		}

// 		removeStudent(st, 5);
// 	}

// 	public static void removeStudent(Student [] st, int id){

// 		int idLength=0;
// 		for (int i=0; i<st.length ; i++) {
			
// 			if (st[i].id == id) {
// 				idLength++;
// 			}
// 		}
// 		Student [] ans = new Student[st.length-idLength];
// 		for (int i=0, j=0; i<st.length ; i++) {
			
// 			if (st[i].id != id) {
// 				ans[j++] = st[i];
// 			}
			
// 		}
// 		System.out.println("-----------------------");
// 		System.out.println("Remaining Student");
// 		System.out.println("-----------------------");
// 		for (int i=0; i<ans.length ; i++) {
// 			ans[i].displayStudent();
// 			System.out.println("-----------------------");
// 		}

// 	}
// }

// 5) Insert an Student on specific Index
// import java.util.*;

// class Student{

// 	String name ;
// 	int id ;
// 	int age;
// 	String coll;
// 	double per;

// 	Student(){

// 	}

// 	Student(String name, int id, int age, String coll, double per){

// 		this.name = name;
// 		this.id = id;
// 		this.age = age;
// 		this.coll = coll;
// 		this.per = per;
// 	}

// 	public void displayStudent(){

// 		System.out.println("Name: "+name);
// 		System.out.println("ID: "+id);
// 		System.out.println("Age: "+age);
// 		System.out.println("College: "+coll);
// 		System.out.println("Percentage: "+per);
// 	}
// }

// class InsertStudent{

// 	public static void main(String[] args) {
		
// 		Student [] db = new Student[4];

// 		db[0] = new Student("Sudarshan", 4, 21, "SP college", 54);
// 		db[1] = new Student("Ram", 3, 22, "SP college", 67);
// 		db[2] = new Student("Shubham", 5, 24, "SP college", 45.5);
// 		db[3] = new Student("Ramesh", 1, 22, "SP college", 94.30);

// 		for (int i=0; i<db.length ; i++) {
// 			db[i].displayStudent();
// 			System.out.println("-----------------------");
// 		}

// 		int idx = 2;

// 		insertStudent(db, idx);
// 	}

// 	public static void insertStudent(Student []db, int idx){

// 		Student [] newDb = new Student[db.length+1];
// 		for (int i=0, j=0; i<newDb.length ; i++) {
			
// 			if (i<idx) {
// 				newDb[i] = db[j++];
// 			}
// 			else if(i==idx) {
// 				newDb[i] = new Student("Rani", 6, 23, "SP college", 95.4);;
// 			}
// 			else{
// 				newDb[i] = db[j++];
// 			}
// 		}
		
// 		System.out.println("-----------------------");
// 		System.out.println("All Students");
// 		System.out.println("-----------------------\n");

// 		for (int i=0; i<newDb.length ; i++) {
// 			newDb[i].displayStudent();
// 			System.out.println("-----------------------");
// 		}
// 	}
// }


// 6) Merge an arrays to specific index

// class Assignment4{

// 	public static void main(String[] args) {
		
// 		int [] arr1 = {10, 20, 30, 40, 50};
// 		int [] arr2 = {1, 2, 3};

// 		int idx = 2;

// 		int [] arr3 = new int[arr1.length+arr2.length];

// 		for (int i=0, j=0; i<arr3.length ; i++) {
			
// 			if (i==idx) {
// 				for (int k=0; k< arr2.length ; k++) {
// 					arr3[i++] = arr2[k];
// 				}
// 			}
// 			arr3[i] = arr1[j++];
// 		}
// 		System.out.println(Arrays.toString(arr3));
// 	}
// }