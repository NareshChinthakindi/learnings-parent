import { compute } from "./compute";


describe('compute', ()=>{

     it('Should be zero if the value is -ve', () =>{

        const result = compute(-1);
        
        expect(result).toBe(0);

     })

     it('Should be next number if the value is +ve', () =>{
        const result = compute(1);
        expect(result).toBe(2);

     })
});