package simform.gitexcercise.android.validation

object Validator {

    object Password {
        const val MIN_LENGTH = 8
        const val MAX_LENGTH = 16
    }

    enum class ValidCredentials {
        VALID, INVALID_EMAIL, INVALID_PASSWORD
    }

    fun isValidCredentials(email: String, password: String): ValidCredentials {
        if (!isValidEmail(email)) return ValidCredentials.INVALID_EMAIL
        if (!isValidPassword(password)) return ValidCredentials.INVALID_PASSWORD
        return ValidCredentials.VALID
    }

    fun isValidEmail(email: String) =
        android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()

    fun isValidPassword(password: String): Boolean =
        password.isNotBlank() && password.length in Password.MIN_LENGTH..Password.MAX_LENGTH
}