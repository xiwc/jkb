jQuery(function($) {

	$('div[action-url]').each(function() {

		var div = $(this);

		div.find('a[class="switch"]').click(function() {

					$(this).parent().find('div[class="io"]').toggle();
				});

		div.find('button').text(div.attr('action-url')).click(function() {

					var _this = $(this);

					// clear the output textarea.
					_this.parent().find('textarea[class="output"]').text("");

					// send ajax post request.
					$.ajax({
								type : "POST",
								url : _this.parent().attr('action-url'),
								contentType : 'application/json',
								processData : false,
								dataType : "json",
								data : JSON.stringify(JSON.parse(_this.parent().find('textarea[class="input"]').val())),
								success : function(msg) {
									_this.parent().find('textarea[class="output"]').text(JSON.stringify(msg))
								}
							});

				});

	});
});