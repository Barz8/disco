/*******************************************************************************
 *   Copyright (C) 2007-2018 Peter Kolb
 *   peter.kolb@linguatools.org
 *
 *   Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *   use this file except in compliance with the License. You may obtain a copy
 *   of the License at 
 *   
 *        http://www.apache.org/licenses/LICENSE-2.0 
 *
 *   Unless required by applicable law or agreed to in writing, software 
 *   distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *   WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the 
 *   License for the specific language governing permissions and limitations
 *   under the License.
 *
 ******************************************************************************/

package de.linguatools.disco;

/**
 * Exception that is thrown when some information that should be present in the
 * file <code>disco.config</code> in the word space directory can not be read.
 * @author peter
 * @version 2.0
 */
public class CorruptConfigFileException extends Exception{
    
    public CorruptConfigFileException(){
    }
    
    public CorruptConfigFileException(String s){
        super(s);
    }
}
