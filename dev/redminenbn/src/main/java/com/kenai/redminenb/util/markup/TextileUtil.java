/*
 * Copyright 2012 Anchialas <anchialas@gmail.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kenai.redminenb.util.markup;

import org.eclipse.mylyn.wikitext.core.parser.MarkupParser;
import org.eclipse.mylyn.wikitext.textile.core.TextileLanguage;

/**
 * Textile Wiki Markup utility.
 *
 * @author Anchialas <anchialas@gmail.com>
 */
public final class TextileUtil {

   private TextileUtil() {
      // omitted
   }

   public static MarkupParser getTextileMarkupParser() {
      return LazyHolder.SINGLETON;
   }

   private static class LazyHolder {

      private static final MarkupParser SINGLETON = createMarkupParser();

      private static MarkupParser createMarkupParser() {
         MarkupParser markupParser = new MarkupParser();
         markupParser.setMarkupLanguage(new TextileLanguage());
         return markupParser;
      }
   }
}
