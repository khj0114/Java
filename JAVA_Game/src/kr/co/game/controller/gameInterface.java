package kr.co.game.controller;

public interface gameInterface {
	public interface gameinterface {
		public void main();
		public void Develop();
		public void characterInsert();
		public void characterUpdate();
		public void characterPrint();
		public void characterDelete();
		
		public void Client();
		public void memberInsert();
		public void memeberGame();
		public void memberUpdate();
		public void memberDelete();
		
		public int searchIndex(String name);
		public int searchIndex2(String id);
	}
}
