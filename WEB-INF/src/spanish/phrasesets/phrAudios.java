package spanish.phrasesets;

/**
 * This phraseset class will be automatically populated with data from the 
 * phraseset project file.  Manual edits should only be outside of the tag 
 * areas or overridden methods. 
 * Class created on: 
 * Last generated by Orchestration Designer at: 30 DE MARZO DE 2022 04:25:32 PM COT
 */
public class phrAudios extends com.avaya.sce.runtime.Phraseset { 

	//{{START:CLASS:FIELDS
	private static final com.avaya.sce.runtime.Phraseset.PhraseMap PHRASE_MAP;
	//}}END:CLASS:FIELDS

	/**
	 * Static initializer
	 */
	static {
		//{{START:PHRASESET:STATIC

		// Create the phrase map, then populate with phrases
		PHRASE_MAP = new com.avaya.sce.runtime.Phraseset.PhraseMap(16);
		com.avaya.sce.runtime.Phrase phrase;

		// phrase: Bienvenida
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "Bienvenida", "IVR.wav", ""); 

		// phrase: DigitaNIT
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "DigitaNIT", "NIT.wav", ""); 

		// phrase: Despedida
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "Despedida", "TXT14.wav", ""); 

		// phrase: ConfirmacionA
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ConfirmacionA", "NumeroDigitadoEs.wav", ""); 

		// phrase: ConfirmacionB
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "ConfirmacionB", "SiEsCorrectoMarque.wav", ""); 

		// phrase: DigitaIdentificacion
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "DigitaIdentificacion", "MENU3.wav", ""); 

		// phrase: Validacion
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "Validacion", "SuNumeroDeValidacionDeDerechosEs.wav", ""); 

		// phrase: Repetir
		com.avaya.sce.runtime.Phraseset.addLocalPhrase(PHRASE_MAP, "Repetir", "ParaRepetirMarque1.wav", ""); 

		//}}END:PHRASESET:STATIC
	}
	/**
	 * Returns the Phrase with the given name.  To override the
	 * behavior and dynamically return a different Phrase object,
	 * override the method "hookGetPhrase(...)".
	 * 
	 * This method is generated automatically by the code generator
	 * and should not be manually edited.  Manual edits may be overwritten
	 * by the code generator.
	 * Last generated by Orchestration Designer at: 1 DE ABRIL DE 2022 12:54:56 PM COT
	 * @see com.avaya.sce.runtime.Phraseset#getPhrase(String) 
	 */ 
	public com.avaya.sce.runtime.Phrase getPhrase(String phraseName) {
		return(getPhrase(phrAudios.PHRASE_MAP, phraseName));
	}
}
