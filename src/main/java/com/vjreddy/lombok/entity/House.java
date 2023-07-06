package com.vjreddy.lombok.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
/**
 * @Data All together now: A shortcut for @ToString, @EqualsAndHashCode, @Getter
 *       on all fields, @Setter on all non-final fields,
 *       and @RequiredArgsConstructor!
 * @author hp
 *
 */
@NoArgsConstructor
@AllArgsConstructor

public class House {
	private String houseName;
	private int hHeight;
	private int hWidth;

}
