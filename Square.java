package shape;


	public class Square extends Shape{

	   public Square(int upperX, int upperY, int width, int height) {
			super(upperX, upperY, width, height);
			// TODO Auto-generated constructor stub
		}

		@Override
		void fillRect(int x, int y, int width, int height) {
			this.upperX=x;
			this.upperY=y;
			this.height=height;
			this.width=width;
		}

		@Override
		void drawOval(int x, int y, int width, int height) {
			// TODO Auto-generated method stub
			
		}

		@Override
		void fillOval(int x, int y, int width, int height) {
			// TODO Auto-generated method stub
			
		}

	}
