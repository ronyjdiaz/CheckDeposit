/*
 Copyright 2013 Neopixl - Olivier Demolliens

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this

file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under

the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF 

ANY KIND, either express or implied. See the License for the specific language governing

permissions and limitations under the License.
 */
package com.neopixl.pixlui.components.edittext;

/**
 * Usefull if you need to track edittext focus
 * @author Olivier Demolliens. @odemolliens
 * Dev with Neopixl
 */
public interface EditTextFocusListener
{
	void requestFocus(EditText edittext);
	void loseFocus(EditText edittext);
}