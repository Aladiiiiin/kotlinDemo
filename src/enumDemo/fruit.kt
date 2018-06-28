package enumDemo

enum class TrangloState(val desc: String, val detail: String? = null) {
    NEW("Initial version"),
    AUTO_RECOVERABLE("auto retry"),
    DECLINED("Declined  can be retry and no need query before retry"),
    DECLINED_UNRECOVERABLE("DECLIEND UNRECOVERABLE"),
    RETRY_ERROR("Error can be retry and no need query before retry"),
    RETRY_ERROR_UNRECOVERABLE("Error can be retry and no need query before retry, not recoverable"),
    FAIL("Error can't be retry"),
    SUSPECT("Suspect and not retriable","This normally happens when GloRemit system is unable to confirm whether the Beneficiary bank has accepted or rejected the transaction. Please email to support@tranglo.com for follow-up."),
    EXECUTING("Execuating status"),
    CANCELLED("Cancelled"),
    COMPLETED("Success")
}