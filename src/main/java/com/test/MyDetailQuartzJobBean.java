�}��  �  ��r	\.����vp>�����V\o&]�َ �`(LJ�Xs�	����1黊z���
x0K[Ij�qsR��7pW�d7�������S^6�z#daM�@�|�q}�Ԙ�c�ǫ�n��s����p@{�5�B�_A�-�ū�VV�:�K���.�*"��wP�[�?|���J�<A"{7��TS}���5lѲ{K�%j��խ+
��A�1LKA�;��0�����JY�Y؇�^����V���TD�󥧹����2�KV8��x���N�Fk�egre�]��~����Z��%q4O�e�]C�a�ޕB��g���R'c3%	��$eGe�M��O�$�dEX*'rj ��<)�ߕ�V�O:H�6�8�̗~�bh�:���?��U�A��5;������dWٞa�Η4H�К1w�L<0��غ�G샹���8����5!���ܞ�;�ƻf)�&���	=�,z���Gh$�e�fB�A���Q\��hh�klD+�[���Ds-�9�")�;�0s�ٶ����O�i���l,�v����������1G	�H���<�^��we|�0����+�:`�����1[r1�J�U��Xú���n@L�}�Q�����k|�V����:�~�dwY5��Y������-a��A�����3��l��4E�3D�h������+������c�s��J�������li0�6�zn#���{�BW��RSu�#�1�KG�WX*���0�r�|>7�~�.*��<x��7�Ս��e"�K3���hB(O��F�/-@�a�5��|�$
�ȶ�m'�%��f�r�	��E�?�)�:>���b�6p�2[;�{uA�(�a��.�fV���O�ɥl��0��^d�O 
���Rc��Q4��������fs�ȅ��	rzg�JT������o�����/�V����4>�q־�ṁ�t�nX���;�a���54ʌR֪{2*s�yO������D��&G7�mrchMethodException e) {
				logger.error(e);
			}

		} catch (Exception e) {
			throw new JobExecutionException(e);
		}
	}

	public void setApplicationContext(ApplicationContext applicationContext) {
		this.ctx = applicationContext;
	}

	public void setTargetObject(String targetObject) {
		this.targetObject = targetObject;
	}

	public void setTargetMethod(String targetMethod) {
		this.targetMethod = targetMethod;
	}

}