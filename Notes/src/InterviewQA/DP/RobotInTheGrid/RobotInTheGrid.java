package InterviewQA.DP.RobotInTheGrid;

import java.util.*;

/**
 * Robot in a Grid: Imagine a robot sitting on the upper left corner of grid
 * with r rows and c columns. The robot can only move in two directions, right
 * and down, but certain cells are "off limits" such that the robot cannot step
 * on them. Design an algorithm to find a path for the robot from the top left
 * to the bottom right.
 * 
 * Output should be a array of points
 */
public class RobotInTheGrid {
    public static void main(String[] args) {
        boolean[][] grid1 = { { true, false, true, false }, { true, true, true, true }, { true, false, false, true },
                { false, false, false, true }, { false, false, false, true } };

        boolean[][] grid2 = { { true, false, true, false }, { false, true, false, false }, { true, false, false, true },
                { false, false, false, true }, { false, false, false, true } };

        boolean[][] grid3 = { { true, true, true, false }, { false, true, true, true }, { true, false, false, true },
                { false, false, false, true }, { true, true, true, true } };

        boolean[][] grid4 = { { true, true, true, true }, { true, false, false, true }, { true, true, true, true },
                { true, false, false, true }, { true, true, true, true }, };

        System.out.println(findWay(grid1));
    }

    public static class Point {
        int row;// y
        int column;// x

        public Point(int row, int column) {
            super();
            this.row = row;
            this.column = column;
        }
    }

    public static ArrayList<Point> findWay(boolean[][] grid) {
        // check length is not null
        if (grid.length == 0 || grid == null)
            return null;
        // check length is not null
        ArrayList<Point> list = new ArrayList<Point>();
        list.add(new Point(0, 0));
        return findWay(grid, list);
    }

    public static ArrayList<Point> findWay(boolean[][] grid, ArrayList<Point> trackPoints) {
        Point last = trackPoints.get(trackPoints.size() - 1);

        // check right
        if (last.column < grid[0].length - 1 && grid[last.row][last.column + 1] == true) {
            trackPoints.add(new Point(last.row, last.column + 1));
            findWay(grid, trackPoints);
        }

        // check down
        if (last.row < grid.length - 1 && grid[last.row + 1][last.column] == true) {
            trackPoints.add(new Point(last.row + 1, last.column));
            findWay(grid, trackPoints);
        }
        // check if reach to the end point
        if (trackPoints.get(trackPoints.size() - 1).row == grid.length - 1
                && trackPoints.get(trackPoints.size() - 1).column == grid[0].length - 1) {
            return trackPoints;
        }
        // No path
        if (last.row != 0 && last.column != 0) {
            // BackTrack
            grid[last.row][last.column] = false;
            trackPoints.remove(trackPoints.size() - 1);
            findWay(grid, trackPoints);
        }
        return null;
    }
}