package com.twu.biblioteca;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.twu.biblioteca.EnumTypes.ActionType;
import com.twu.biblioteca.Models.Action;

public class ActionTest {
	
	@Test
	public void constructorShouldInstantiateCorrectly() {
		ActionType type = ActionType.BACK_TO_MAIN_MENU;
		Action action = new Action(type);
		assertEquals(type, action.type);
		
		String arg1 = "hello";
		Integer arg2 = 1;
		action = new Action(type, arg1, arg2);
		
		assertTrue(arg1.equals(action.args.get(0)));
		assertTrue(arg2.equals(action.args.get(1)));
	}
	
	@Test
	public void shouldAddArgsCorrectly() {
		String arg1 = "hello";
		Integer arg2 = 1;
		ActionType type = ActionType.BACK_TO_MAIN_MENU;
		Action action = new Action(type);		
		
		action.addArg(arg1);
		action.addArg(arg2);
		
		assertTrue(arg1.equals(action.args.get(0)));
		assertTrue(arg2.equals(action.args.get(1)));
	}

}
