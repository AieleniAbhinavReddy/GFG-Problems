class Solution:
    def checkStatus(self, a, b, flag):
        if flag:
            if a<0 and b<0:
                return True
        else:
            if a>0:
                if b<0:
                    return True
            else:
                if b>0:
                    return True
        return False;