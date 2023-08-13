import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url '/test'
    }
    response {
        status 200
        body('Hello World!')
    }
}
