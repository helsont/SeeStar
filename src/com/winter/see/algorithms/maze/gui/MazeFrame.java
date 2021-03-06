package com.winter.see.algorithms.maze.gui;

import com.winter.see.algorithms.maze.AbstractMazeGenerator;
import com.winter.see.algorithms.maze.algorithms.DivisionMaze;
import com.winter.see.core.AlgorithmFrame;

public class MazeFrame {
	public static void main(String[] args) {
		int width = 25;
		int height = 25;
		AbstractMazeGenerator maze = new DivisionMaze(width, height);
		MazeComponent panel = new MazeComponent();
		MazeThread thread = new MazeThread(maze, panel, maze.maze);
		ExportPanel ex = new ExportPanel(maze, panel);
		SelectGeneratorPanel select = new SelectGeneratorPanel(maze, panel,
				thread, ex);
		new AlgorithmFrame(panel, thread).addPanelEast(select)
				.addPanelSouth(ex);
	}
}
