package in.com.serializable;

import java.io.Serializable;

 class Marks implements Serializable  {
		public int java;
		public int maths;
		public int python;
		
		public void setJava(int java) {
			this.java = java;
		}public int getJava() {
			return java;
		}public void setMaths(int maths) {
			this.maths = maths;
		}public int getMaths() {
			return maths;
		}public void setPython(int python) {
			this.python = python;
		}public int getPython() {
			return python;
		}
		


}
