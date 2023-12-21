package com.asenov.adventofcode.year2023.day10;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class Position {
    private int x;
    private int y;

    public Position get(Direction direction) {
        return switch (direction) {
            case Direction.NORTH -> new Position(this.x - 1, this.y);
            case Direction.EAST -> new Position(this.x, this.y + 1);
            case Direction.WEST -> new Position(this.x, this.y - 1);
            case Direction.SOUTH -> new Position(this.x + 1, this.y);
        };
    }

    public List<Position> getPositionsAround() {
        return List.of(
            get(Direction.NORTH),
            get(Direction.EAST),
            get(Direction.WEST),
            get(Direction.SOUTH)
        );
    }
}
