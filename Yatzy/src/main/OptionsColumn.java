package main;

public class OptionsColumn extends Column{

	public OptionsColumn(String _name, int _posX, int _posY) {
		super(_name, _posX, _posY);
		for(Cell c : cells) {
			c.setText(c.option.label());
			c.setToolTipText(c.option.label());
			c.setEnabled(false);
			
		}
	}

/*
	public void addCells() {
		Cell cell1 = new Cell(posX, posY, ScoreBoard.colWidth, ScoreBoard.cellLength);
		cell1.setText(name);
		cell1.setEnabled(false);
		cells = new Cell[1 + nCols];
		cells[0] = cell1;
		for(int i=1; i< 1 + nCols; i++) {
			cells[i] = new Cell(posX, posY+ (ScoreBoard.cellLength*i), ScoreBoard.colWidth, ScoreBoard.cellLength);
		}
	}*/
	
	

}